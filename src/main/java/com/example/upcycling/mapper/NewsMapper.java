package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.domain.vo.NewsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NewsMapper {
    //    리스트 조회
    List<NewsVo> selectList();
//    단건 조회
    NewsVo selectDetail(Long newsNumber);

}
