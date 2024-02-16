package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.FaqDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface FaqMapper {
    List<FaqDto> selectSearch (String keyword);

    List<FaqDto> selectAll();

    Optional<FaqDto> selectBoard(Long faqNumber);

//    Optional<FaqDto> selectBoardLeft(Long faqNumber);
//    Optional<FaqDto> selectBoardRight(Long faqNumber);
//    Optional<FaqDto> selectBoardMax(Long faqNumber);

}

