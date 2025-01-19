package com.antoniohenriquep.inventory.controllers;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> findAll()
    {
        return ResponseEntity.ok(itemService.findAll());
    }

}
