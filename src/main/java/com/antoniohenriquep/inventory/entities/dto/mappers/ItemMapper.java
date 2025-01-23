package com.antoniohenriquep.inventory.entities.dto.mappers;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.entities.dto.ItemCreateDTO;
import com.antoniohenriquep.inventory.entities.dto.ItemResponseDTO;
import org.modelmapper.ModelMapper;

public class ItemMapper {

    public static Item toItem(ItemCreateDTO dto)
    {
        return new ModelMapper().map(dto, Item.class);
    }

    public static ItemResponseDTO toDto(Item item)
    {
        return new ModelMapper().map(item, ItemResponseDTO.class);
    }

}
