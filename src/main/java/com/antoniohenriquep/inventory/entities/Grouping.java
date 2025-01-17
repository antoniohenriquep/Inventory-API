package com.antoniohenriquep.inventory.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Grouping {

    @Id
    private Long id;

    private String name;


}
