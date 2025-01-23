package com.antoniohenriquep.inventory.services;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.entities.dto.ItemCreateDTO;
import com.antoniohenriquep.inventory.entities.dto.mappers.ItemMapper;
import com.antoniohenriquep.inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item save(ItemCreateDTO dto) {
        Item item = ItemMapper.toItem(dto);
        return itemRepository.save(item);
    }
}
