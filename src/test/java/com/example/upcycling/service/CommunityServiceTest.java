package com.example.upcycling.service;

import com.example.upcycling.domain.vo.CommunityVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommunityServiceTest {
    @Autowired
    CommunityService communityService;

//
//
//    @Test
//    void findList() {
//        List<CommunityVo> communityList = communityService.findList();
//        System.out.println("communityList = " + communityList);
//    }
}