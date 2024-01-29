package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.FaqDto;
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
        List<FaqDto> found = faqMapper.selectSearch("업사이클링");
        System.out.println("found = " + found);
    }

    @Test
    void selectAll(){
        List<FaqDto> faqMainList = faqMapper.selectAll();
        System.out.println("faqMainList = " + faqMainList);
    }

    @Test
    void selectBoard(){
        Optional<FaqDto> faqBoard = faqMapper.selectBoard(1L);
        System.out.println("faqBoard = " + faqBoard);
    }
}