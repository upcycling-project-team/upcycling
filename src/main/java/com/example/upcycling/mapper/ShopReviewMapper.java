package com.example.upcycling.mapper;


import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MainReviewVo;

import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.dto.ReviewImgDto;
import com.example.upcycling.domain.dto.ShopReviewDto;
import com.example.upcycling.domain.vo.Criteria;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

import java.util.List;

@Mapper
public interface ShopReviewMapper {

    public List<MainReviewVo> selectReviewList(Criteria criteria);

    public int selectReviewTotal();

//    내가한거
    List<ShopReviewDto> selectReviewList2(@Param("productNumber") Long productNumber,
                                         @Param("criteria") Criteria criteria);

    int selectTotal(Long productNumber);

    Optional<Double> selectStarAvg(Long productNumber);

    Optional<Long> selectProductNumber(Long productNumber);

    //    구매한 사람인지 확인하는 용도(조회결과가 0보다 크면 구매했다는 뜻이다.)
    Optional<Long> selectCount(Long userNumber,Long productNumber);

    //    구매평 삽입
    void insert(ShopReviewDto shopReviewDto);

}
