package com.antoniohenriquep.inventory.services;

import com.antoniohenriquep.inventory.entities.Item;
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
}
