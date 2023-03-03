package com.vn.ecommerservice.repo;

import com.vn.ecommerservice.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    @Query("SELECT p FROM Product p where p.idCategory = ?1 and p.status = true and p.quantity > 0")
    List<Product> listProductByCategoryId(int idCategory);
    @Query("SELECT p FROM Product p where p.status = true and p.quantity > 0")
    List<Product> allProduct();
}
