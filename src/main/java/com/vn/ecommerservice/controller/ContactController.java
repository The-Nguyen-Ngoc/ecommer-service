package com.vn.ecommerservice.controller;

import com.vn.ecommerservice.entity.Category;
import com.vn.ecommerservice.entity.Contact;
import com.vn.ecommerservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping
    public ResponseEntity<?> listAllContact() {

        List<Contact> listContactActiveIsTrue = contactService.listAllContact();

        if (listContactActiveIsTrue.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listContactActiveIsTrue);
        }

    }
}
