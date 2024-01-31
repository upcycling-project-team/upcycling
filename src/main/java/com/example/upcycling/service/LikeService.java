package com.example.upcycling.service;

import com.example.upcycling.domain.vo.LikeVo;
import com.example.upcycling.mapper.LikeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class LikeService {
    private final LikeMapper likeMapper;
    //좋아요 누르기 insert
    public void insertLike(LikeVo likeVo){
        likeMapper.insertLike(likeVo);
    }

    //좋아요 취소 delete
    public void deleteLike(Long userNumber, Long communityNumber) {
        likeMapper.deleteLike(userNumber,communityNumber);
    }

    //좋아요 카운트 select
    public int selectLike(Long userNumber, Long communityNumber) {
        int likeCount = likeMapper.selectLike(userNumber, communityNumber);
        return likeCount;
    }
}
