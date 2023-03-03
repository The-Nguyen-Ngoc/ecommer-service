package com.vn.ecommerservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "navigations")
public class Navigation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String icon;
    private String link;
    private int arrange;
    private boolean status = true;
}
