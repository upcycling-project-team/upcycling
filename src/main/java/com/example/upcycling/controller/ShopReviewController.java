package com.example.upcycling.controller;

import com.example.upcycling.service.ShopReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ShopReviewController {
    private final ShopReviewService shopReviewService;

    @GetMapping("/shop01")
    public String shop01(){
        return "shop/shop01";
    }

    @GetMapping("/shop02")
    public String shop02(){
        return "shop/shop02";
    }
}
