package com.antoniohenriquep.inventory.entities.dto;

import com.antoniohenriquep.inventory.entities.Grouping;


public class ItemUpdateDTO {

    private String code;
    private String name;
    private String type;
    private String status;
    private Grouping grouping;

    public ItemUpdateDTO(){}

    public ItemUpdateDTO(String code, String name, String type, String status, Grouping grouping) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.status = status;
        this.grouping = grouping;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Grouping getGrouping() {
        return grouping;
    }

    public void setGrouping(Grouping grouping) {
        this.grouping = grouping;
    }
}
