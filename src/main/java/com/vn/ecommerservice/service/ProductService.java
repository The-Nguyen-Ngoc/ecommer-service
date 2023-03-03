package com.vn.ecommerservice.service;

import com.vn.ecommerservice.entity.Product;
import com.vn.ecommerservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getListProductByCategory(int categoryId){
        return productRepo.listProductByCategoryId(categoryId);
    }
    public List<Product> getAllProduct(){
        return productRepo.allProduct();
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }
}
