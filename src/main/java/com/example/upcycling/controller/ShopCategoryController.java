package com.example.upcycling.controller;

import com.example.upcycling.service.ShopCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ShopCategoryController {
    private final ShopCategoryService shopCategoryService;
}
