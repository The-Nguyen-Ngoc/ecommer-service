package com.vn.ecommerservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "trendings")
@Data
public class Trending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int idCategory;
    private String description;
    @Column(unique = true)
    private int arrange;
    private boolean status = true;
}
