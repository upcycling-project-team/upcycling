package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.OnlineDonationDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OnlineDonationMapper {
    //    데이터 삽입
    void insert(OnlineDonationDto onlineDonationDto);
//    데이터 삭제
//    데이터 수정?(필요할까?)
//    데이터 단건 조회
//    데이터 리스트 조회
}
