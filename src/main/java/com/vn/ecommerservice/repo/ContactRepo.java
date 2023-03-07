package com.vn.ecommerservice.repo;

import com.vn.ecommerservice.entity.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepo extends CrudRepository<Contact, Integer> {

    @Query("SELECT c from Contact c where c.status = true ")
    List<Contact> listAllContact();
}
