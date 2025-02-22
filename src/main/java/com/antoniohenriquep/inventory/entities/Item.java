package com.antoniohenriquep.inventory.entities;

import com.antoniohenriquep.inventory.entities.enums.ItemStatus;
import com.antoniohenriquep.inventory.entities.enums.ItemType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity

public class Item implements Serializable {

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

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
        this.type = verifyType(name);
        this.status = ItemStatus.BACKUP;
    }

    public Item(Long id, String code, String name, ItemType type, ItemStatus status, Grouping grouping) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.type = type;
        this.status = status;
        this.grouping = grouping;
    }

    private ItemType verifyType(String name)
    {
        if (name.contains("PRINTER") || name.contains("IMPRESSORA")) {
            return ItemType.PRINTER;
        } else if (name.contains("RADIOLOGY")) {
            return ItemType.PRINTER_RADIOLOGY;
        } else if (name.contains("DESKTOP") || name.contains("GABINETE")) {
            return ItemType.DESKTOP;
        } else if (name.contains("MONITOR")) {
            return ItemType.MONITOR;
        } else if (name.contains("STABILIZER") || name.contains("ESTABILIZADOR")) {
            return ItemType.STABILIZER;
        } else if (name.contains("NOTEBOOK")) {
            return ItemType.NOTEBOOK;
        }
        else
            throw new IllegalArgumentException("Invalid item type");
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

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
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
