package com.vn.ecommerservice.service;

import com.vn.ecommerservice.entity.Contact;
import com.vn.ecommerservice.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    ContactRepo contactRepo;

    public List<Contact> listAllContact(){
        return contactRepo.listAllContact();
    }
}
