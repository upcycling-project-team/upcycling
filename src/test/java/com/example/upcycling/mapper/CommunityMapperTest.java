package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.LikeVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityMapperTest {
    @Autowired
    CommunityMapper communityMapper;
    CommunityDto communityDto;



//    @Test
//    void selectList() {
//        List<CommunityVo> communityList = communityMapper.selectList();
//        System.out.println("communityList = " + communityList);
//    }
    @Test
    void selectDetail(){
        CommunityVo communityDetail = communityMapper.selectDetail(7L);
        System.out.println("communityDetail = " + communityDetail);

    }
    @Test

    void selectId(){
        String userId = communityMapper.selectId(8L).get();
        System.out.println("userId = " + userId);
    }
    @Test
    void insertWrite(){
   communityDto = new CommunityDto();
   communityDto.setCommunityContent("안녕하세요");
   communityDto.setCommunityTitle("제목1111111111");
   communityDto.setUserNumber(8L);
   communityMapper.insert(communityDto);
    }

    }
