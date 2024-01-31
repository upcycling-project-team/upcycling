package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.NewsVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NewsMapperTest {
    @Autowired
            NewsMapper newsMapper;
    
            
    @Test
    void selectList() {
        List<NewsVo> newsList = newsMapper.selectList();
        System.out.println("newsList = " + newsList);
    }
    @Test
    void selectDetail(){
        NewsVo newsDetail = newsMapper.selectDetail(6L);
        System.out.println("newsDetail = " + newsDetail);
    }
}