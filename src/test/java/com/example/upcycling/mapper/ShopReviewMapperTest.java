package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShopReviewMapperTest {
    @Autowired
    ShopReviewMapper shopReviewMapper;

    @Test
    void selectReviewList(){
        List<ShopReviewDto> selectReviewList = shopReviewMapper.selectReviewList2(2L, new Criteria());
        System.out.println("selectReviewList = " + selectReviewList);
    }

    
    @Test
    void selectCount(){
        Optional<Long> selectCount = shopReviewMapper.selectCount(22L,2L);
        System.out.println("selectCount = " + selectCount);
    }

}