package com.antoniohenriquep.inventory.entities.dto.mappers;

import com.antoniohenriquep.inventory.entities.Item;
import com.antoniohenriquep.inventory.entities.dto.ItemCreateDTO;
import com.antoniohenriquep.inventory.entities.dto.ItemResponseDTO;
import org.modelmapper.ModelMapper;

public class ItemMapper {

    public static Item toItem(ItemCreateDTO dto)
    {
        return new Item(dto.getCode(), dto.getName());
    }

    public static ItemResponseDTO toDto(Item item)
    {
        return new ItemResponseDTO(
                item.getId(),
                item.getCode(),
                item.getName(),
                item.getType().toString(),
                item.getStatus().toString()
        );
    }

}
