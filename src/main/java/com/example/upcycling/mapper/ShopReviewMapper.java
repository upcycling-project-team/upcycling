package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MainReviewVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopReviewMapper {
    public List<MainReviewVo> selectReviewList(Criteria criteria);

    public int selectReviewTotal();
}
