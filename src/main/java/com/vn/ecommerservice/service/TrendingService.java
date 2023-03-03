package com.vn.ecommerservice.service;

import com.vn.ecommerservice.entity.Trending;
import com.vn.ecommerservice.repo.TrendingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendingService {
    @Autowired
    TrendingRepo trendingRepo;

    public List<Trending> listTrendingActiveIsTrue(){
        return trendingRepo.listTrendingActive(true);
    }

    public Trending addTrending(Trending trending){
        return trendingRepo.save(trending);
    }
}
