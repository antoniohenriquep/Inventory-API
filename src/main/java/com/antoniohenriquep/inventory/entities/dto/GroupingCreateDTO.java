package com.antoniohenriquep.inventory.entities.dto;

public class GroupingCreateDTO {

    private String name;
    private Long department_id;

    public GroupingCreateDTO(String name, Long department_id) {
        this.name = name;
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }
}
