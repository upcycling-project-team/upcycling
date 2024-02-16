package com.example.upcycling.mapper;

import com.example.upcycling.domain.vo.CommunityReplyVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ReplyMapperTest {
    @Autowired
    ReplyMapper replyMapper;
    CommunityReplyVo communityReplyVo;
    @Test
    void selectReply(){
        List<CommunityReplyVo> communityReply = replyMapper.selectReply(46L);
    }
    @Test
    void insertReply(){
        communityReplyVo = new CommunityReplyVo();
        communityReplyVo.setCommunityReplyContent("하이");
        communityReplyVo.setUserNumber(26L);
        communityReplyVo.setCommunityNumber(46L);
        replyMapper.insertReply(communityReplyVo);
    }

}