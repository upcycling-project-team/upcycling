package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.ReviewImgDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ShopReviewImgMapper {
    void insert(ReviewImgDto reviewImgDto);
}
