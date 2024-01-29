package com.example.upcycling.service;

import com.example.upcycling.domain.dto.FaqDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FaqServiceTest {
    @Autowired
    FaqService faqService;

    @Test
    void selectAll(){
        List<FaqDto> faqQuestionList = faqService.selectAll();
        System.out.println("faqQuestionList = " + faqQuestionList);
    }

//    테스트에는 매개변수를 담으면 안됨.
    @Test
    void findBoard(){
        Optional<FaqDto> foundBoard = faqService.findBoard(1L);
        System.out.println("foundBoard = " + foundBoard);
    }

}