package com.antoniohenriquep.inventory.entities;

import com.antoniohenriquep.inventory.Department;
import jakarta.persistence.*;

@Entity
public class Localization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
}
