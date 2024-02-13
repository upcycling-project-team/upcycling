package com.example.upcycling.service;

import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.MainReviewVo;
import com.example.upcycling.mapper.ShopReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopReviewService {
    private final ShopReviewMapper shopReviewMapper;

    public List<MainReviewVo> findReviewList(Criteria criteria){
        return shopReviewMapper.selectReviewList(criteria);
    }

    public int findReviewTotal(){
        return shopReviewMapper.selectReviewTotal();
    }
}
