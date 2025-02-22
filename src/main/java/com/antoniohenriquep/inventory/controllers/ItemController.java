package com.antoniohenriquep.inventory.controllers;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.entities.dto.ItemCreateDTO;
import com.antoniohenriquep.inventory.entities.dto.ItemResponseDTO;
import com.antoniohenriquep.inventory.entities.dto.mappers.ItemMapper;
import com.antoniohenriquep.inventory.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemResponseDTO>> findAll()
    {
        List<ItemResponseDTO> items = itemService.findAll()
                .stream()
                .map(i -> ItemMapper.toDto(i))
                .collect(Collectors.toList());

        return new ResponseEntity(items, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDTO> findById(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(ItemMapper.toDto(itemService.findById(id)));
    }

    @PostMapping
    public ResponseEntity<ItemResponseDTO> create(@RequestBody ItemCreateDTO dto)
    {
        Item item = itemService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(ItemMapper.toDto(item));
    }

}
