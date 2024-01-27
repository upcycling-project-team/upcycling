package com.example.upcycling.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
class FaqMapperTest {
    @Autowired
    FaqMapper faqMapper;
    
    @Test
    void select() {
        List<String> found = faqMapper.selectSearch("업사이클링");
        System.out.println("found = " + found);
    }
}