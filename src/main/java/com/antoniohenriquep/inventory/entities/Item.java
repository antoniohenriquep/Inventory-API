package com.antoniohenriquep.inventory.entities;

import com.antoniohenriquep.inventory.entities.enums.ItemStatus;
import com.antoniohenriquep.inventory.entities.enums.ItemType;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;

    @Enumerated(EnumType.STRING)
    private ItemType type;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @ManyToOne
    @JoinColumn(name = "grouping_id")
    private Grouping grouping;



    public Item() {}

    public Item(String code, String name, ItemType type) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.status = ItemStatus.BACKUP;
    }

    public Long getId() {
        return id;
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

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
