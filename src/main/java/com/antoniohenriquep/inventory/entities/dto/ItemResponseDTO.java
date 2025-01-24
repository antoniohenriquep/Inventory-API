package com.antoniohenriquep.inventory.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemResponseDTO {

    private Long id;
    private String code;
    private String name;
    private String type;
    private String status;


    public ItemResponseDTO(Long id,String code, String name, String type, String status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
