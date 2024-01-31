package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.LikeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface LikeMapper {
    // 좋아요 누르기 insert
    void insertLike(LikeVo likeVo);

    //좋아요 취소 delete
    void deleteLike(Long userNumber,Long communityNumber);

    //좋아요 카운트 select
    int selectLike(Long userNumber,Long communityNumber);



}
