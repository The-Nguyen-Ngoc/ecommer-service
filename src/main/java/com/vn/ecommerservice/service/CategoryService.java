package com.vn.ecommerservice.service;

import com.vn.ecommerservice.entity.Category;
import com.vn.ecommerservice.entity.Trending;
import com.vn.ecommerservice.repo.CategoryRepo;
import com.vn.ecommerservice.repo.TrendingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> listCategoryActiveIsTrue() {
        return categoryRepo.listCategoryActive(true);
    }

    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }
}
