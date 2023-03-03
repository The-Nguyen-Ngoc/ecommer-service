package com.vn.ecommerservice.controller;

import com.vn.ecommerservice.entity.Product;
import com.vn.ecommerservice.entity.Trending;
import com.vn.ecommerservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/{categoryId}")
    public ResponseEntity<?> listAllProductWitCategory(@PathVariable(name = "categoryId") int categoryId) {
        List<Product> allProducts = new ArrayList<>();
        if (categoryId == 6) {
            allProducts = productService.getAllProduct();
        } else {
            allProducts = productService.getListProductByCategory(categoryId);

        }
        if (allProducts.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(allProducts);
        }

    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {

        Product productSaved = productService.addProduct(product);

        if (productSaved == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(productSaved);
        }

    }
}
