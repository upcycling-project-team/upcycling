package com.example.upcycling.service;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.ProductVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceTest {
    @Autowired
    ProductService productService;

//    @Test
//    void findAll(){
//        List<ProductVo> productList = productService.findAll();
//        System.out.println("productList = " + productList);
//    }

//    @Test
//    void finaStar(){
//        ProductDto star = productService.findStarAvg(4L);
//        System.out.println("star = " + star);
//    }

//    @Test
//    void findReview(){
//        ProductDto review = productService.findReview(4L);
//        System.out.println("review = " + review);
//    }
}