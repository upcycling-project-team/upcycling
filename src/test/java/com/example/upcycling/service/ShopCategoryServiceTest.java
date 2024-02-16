package com.example.upcycling.service;

import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.domain.dto.ShopCategoryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShopCategoryServiceTest {
    @Autowired
    ShopCategoryService shopCategoryService;

    @Test
    void findBoard(){
        ShopCategoryDto foundName = shopCategoryService.findShopCategoryName(1L);
        System.out.println("foundName = " + foundName);
    }
}