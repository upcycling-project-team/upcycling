package com.example.upcycling.mapper;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.CommunityCommentVO;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.LikeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CommunityMapper {
    //    리스트 조회
    List<CommunityVo> selectList(Criteria criteria);
    //  리스트 페이징처리
    int listTotal();

    //    리스트 상세(단건 조회)
    CommunityVo selectDetail(Long communityNumber);

    //    댓글 userId (단건 조회)
    Optional<String> selectId(Long userNumber);

    //  글쓰기
    void insert(CommunityDto communityDto);




}
