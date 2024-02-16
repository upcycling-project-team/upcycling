package com.example.upcycling.service;

import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopReviewServiceTest {
    @Autowired
    ShopReviewService shopReviewService;
    
    @Test
    void findReviewList(){
        List<ShopReviewDto> shopReviewList = shopReviewService.findReviewList(2L, new Criteria());
        System.out.println("shopReviewList = " + shopReviewList);
    }

    @Test
    void findCount(){
        Long count = shopReviewService.findCount(22L,4L);
        System.out.println("count = " + count);
    }
}