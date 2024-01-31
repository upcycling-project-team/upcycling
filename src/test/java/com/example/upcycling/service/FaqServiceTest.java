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
        FaqDto foundBoard = faqService.findBoard(1L);
        System.out.println("foundBoard = " + foundBoard);
    }
    
    @Test
    void findBoardLeft(){
        FaqDto foundBoard2 = faqService.findBoardLeft(1L);
        System.out.println("foundBoard2 = " + foundBoard2);
    }

    @Test
    void findBoardMax(){
        FaqDto foundBoard3 = faqService.findBoardMax(1L);
        System.out.println("foundBoard3 = " + foundBoard3);
    }

    @Test
    void register(){
        FaqDto faqDto = new FaqDto();
        faqDto.setFaqQuestion("질문제목");
        faqDto.setFaqAnswer("질문제목에 대한 답변입니다.");
        faqDto.setAdministratorNumber(1L);
        faqService.register(faqDto);
    }

}