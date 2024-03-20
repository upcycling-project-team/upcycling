package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.CommunityReplyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {

//    댓글 조회
        List<CommunityReplyVo> selectReply(Long communityNumber);
//    댓글 쓰기
        void insertReply(CommunityReplyVo communityReplyVo);
}
