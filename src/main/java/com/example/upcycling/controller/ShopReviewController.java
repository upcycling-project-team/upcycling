package com.example.upcycling.controller;

import com.example.upcycling.service.ShopReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ShopReviewController {
    private final ShopReviewService shopReviewService;
}
