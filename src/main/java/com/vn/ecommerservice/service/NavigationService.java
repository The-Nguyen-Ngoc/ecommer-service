package com.vn.ecommerservice.service;

import com.vn.ecommerservice.entity.Navigation;
import com.vn.ecommerservice.repo.NavigationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavigationService {
    private NavigationRepo navigationRepo;

    public NavigationService(NavigationRepo navigationRepo) {
        this.navigationRepo = navigationRepo;
    }

    public List<Navigation> listAllNavigationsActive(){
        return navigationRepo.findAllByStatus(true);
    }
}
