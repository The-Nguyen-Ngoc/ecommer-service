package com.vn.ecommerservice.repo;

import com.vn.ecommerservice.entity.Trending;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrendingRepo extends CrudRepository<Trending, Integer> {
    @Query("SELECT t FROM Trending t where t.status = ?1 order by t.arrange")
    List<Trending> listTrendingActive(boolean status);
}
