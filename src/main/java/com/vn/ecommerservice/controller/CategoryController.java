package com.vn.ecommerservice.controller;

import com.vn.ecommerservice.entity.Category;
import com.vn.ecommerservice.entity.Trending;
import com.vn.ecommerservice.service.CategoryService;
import com.vn.ecommerservice.service.TrendingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<?> listAllCategory() {

        List<Category> listCategoryActiveIsTrue = categoryService.listCategoryActiveIsTrue();

        if (listCategoryActiveIsTrue.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listCategoryActiveIsTrue);
        }

    }
    @PostMapping
    public ResponseEntity<?> addCategory(@RequestBody Category category) {

        Category categorySaved = categoryService.addCategory(category);

        if (categorySaved == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(categorySaved);
        }

    }
}
