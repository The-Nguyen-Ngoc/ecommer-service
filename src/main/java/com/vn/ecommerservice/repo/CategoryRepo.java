package com.vn.ecommerservice.repo;

import com.vn.ecommerservice.entity.Category;
import com.vn.ecommerservice.entity.Trending;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
    @Query("SELECT c FROM Category c where c.status = ?1 order by c.arrange")
    List<Category> listCategoryActive(boolean status);
}
