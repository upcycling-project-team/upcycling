package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.ProductVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductMapperTest {
    @Autowired
    ProductMapper productMapper;
    
//    @Test
//    void selectAll(){
//        List<ProductVo> selectAll = productMapper.selectAll();
//        System.out.println("selectAll = " + selectAll);
//    }
}