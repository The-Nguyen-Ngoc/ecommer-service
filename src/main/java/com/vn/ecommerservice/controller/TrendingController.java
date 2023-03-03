package com.vn.ecommerservice.controller;

import com.vn.ecommerservice.entity.Navigation;
import com.vn.ecommerservice.entity.Trending;
import com.vn.ecommerservice.service.TrendingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trending")
public class TrendingController {
    private TrendingService trendingService;

    public TrendingController(TrendingService trendingService) {
        this.trendingService = trendingService;
    }

    @GetMapping
    public ResponseEntity<?> listAllTrending() {

        List<Trending> listTrendingActiveIsTrue = trendingService.listTrendingActiveIsTrue();

        if (listTrendingActiveIsTrue.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listTrendingActiveIsTrue);
        }

    }
    @PostMapping
    public ResponseEntity<?> addTrending(@RequestBody Trending trending) {

        Trending trendingSaved = trendingService.addTrending(trending);

        if (trendingSaved == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(trendingSaved);
        }

    }
}
