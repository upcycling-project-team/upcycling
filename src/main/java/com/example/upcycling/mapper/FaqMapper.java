package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.FaqDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface FaqMapper {
    //게시물 단건 조회 #{keyword}의 타입이 String 이다.
    List<String> selectSearch (String keyword);
}

