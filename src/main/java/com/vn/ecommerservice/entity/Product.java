package com.vn.ecommerservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    private String name;
    @Column(name = "id_category")
    private int idCategory;

    @Column(name = "link_image")
    private String linkImage;

    private Long cost;

    private Long price;
    @Column(name = "percent_reduction", nullable = true)
    private Long percentReduction;

    private String description;
    private String parameter;

    private boolean status = true;
    private boolean stock = true;

    public Long getPrice() {
        return this.cost - this.cost * this.percentReduction / 100;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
