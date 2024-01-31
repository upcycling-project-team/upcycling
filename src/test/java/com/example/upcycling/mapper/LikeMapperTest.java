package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.LikeVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LikeMapperTest {

    @Autowired
    LikeMapper likeMapper;
    LikeVo likeVo;

    @Test
    void insertLike() {
        LikeVo likeVo = new LikeVo();
        likeVo.setCommunityNumber(1L);
        likeVo.setUserNumber(2L);

        likeMapper.insertLike(likeVo);
    }

    @Test
    void deleteLike() {
        likeMapper.deleteLike(2L,1L);
    }

    @Test
    void selectLike() {
        int count = likeMapper.selectLike(6L,1L);
    }
}