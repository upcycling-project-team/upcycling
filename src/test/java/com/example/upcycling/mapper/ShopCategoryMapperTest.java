package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.domain.dto.ShopCategoryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShopCategoryMapperTest {
    @Autowired
    ShopCategoryMapper shopCategoryMapper;
    
    @Test
    void selectShopCategoryName(){
        Optional<ShopCategoryDto> name = shopCategoryMapper.selectShopCategoryName(1L);
        System.out.println("name = " + name);

    }
    
}