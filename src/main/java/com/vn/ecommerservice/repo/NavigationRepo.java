package com.vn.ecommerservice.repo;

import com.vn.ecommerservice.entity.Navigation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NavigationRepo extends CrudRepository<Navigation, Integer> {

    @Query("SELECT n from Navigation n where n.status = ?1 order by n.arrange")
    List<Navigation> findAllByStatus(boolean status);
}
