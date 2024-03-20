package com.example.upcycling.service;

import com.example.upcycling.domain.vo.CommunityReplyVo;
import com.example.upcycling.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyMapper replyMapper;

    public List<CommunityReplyVo> findList(Long communityNumber){
        return replyMapper.selectReply(communityNumber);
    }
    public void insertReply(CommunityReplyVo communityReplyVo){
        replyMapper.insertReply(communityReplyVo);
    }
}
