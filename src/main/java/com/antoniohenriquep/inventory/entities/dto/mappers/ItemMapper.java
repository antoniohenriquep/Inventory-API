package com.antoniohenriquep.inventory.entities.dto.mappers;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.entities.dto.ItemCreateDTO;
import com.antoniohenriquep.inventory.entities.dto.ItemResponse;
import org.modelmapper.ModelMapper;

public class ItemMapper {

    public static Item toItem(ItemCreateDTO dto)
    {
        return new ModelMapper().map(dto, Item.class);
    }

    public static ItemResponse toDto(Item item)
    {
        return new ModelMapper().map(item, ItemResponse.class);
    }

}
