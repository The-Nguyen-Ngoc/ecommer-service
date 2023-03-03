package com.vn.ecommerservice.controller;

import com.vn.ecommerservice.entity.Navigation;
import com.vn.ecommerservice.service.NavigationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/navigations")
public class NavigationController {

    private NavigationService navigationService;

    public NavigationController(NavigationService navigationService) {
        this.navigationService = navigationService;
    }

    @GetMapping
    public ResponseEntity<?> listAllNav() {

        List<Navigation> navigations = navigationService.listAllNavigationsActive();

        if (navigations.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(navigations);
        }

    }

}
