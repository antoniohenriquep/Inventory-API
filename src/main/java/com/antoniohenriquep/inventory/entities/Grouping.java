package com.antoniohenriquep.inventory.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Grouping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "grouping")
    private List<Item> items;


    public Grouping() {}

    public Grouping(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItems(Item item) {
        items.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grouping grouping = (Grouping) o;
        return Objects.equals(id, grouping.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
