package com.example.upcycling.controller;


import com.example.upcycling.domain.vo.CommunityReplyVo;
import com.example.upcycling.domain.vo.LikeVo;
import com.example.upcycling.service.LikeService;
import com.example.upcycling.service.ReplyService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.AttributedString;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReplyRestController {
    private final ReplyService replyService;


    @GetMapping("/replies")
    public List<CommunityReplyVo> findList(Long communityNumber) {
        List<CommunityReplyVo> replyList = replyService.findList(communityNumber);

        return replyList;
    }
    @PostMapping("/insertReply")
    public void insertReply(@RequestBody CommunityReplyVo communityReplyVo)
//                            @SessionAttribute("userNumber")Long userNumber
        {
            Long userNumber = 26L;
    communityReplyVo.setUserNumber(userNumber);
    replyService.insertReply(communityReplyVo);
    }

//    @DeleteMapping("/likes")
//    public void delete(Long communityNumber,Long userNumber){
//        likeService.deleteLike(userNumber,communityNumber);
//    }
//
//    @GetMapping("/likes")
//    public int select(Model model,Long communityNumber,Long userNumber ,HttpSession session){
//        int likeSelect = likeService.selectLike(userNumber,communityNumber);
////        userNumber=(Long)session.getAttribute("userNumber");
//       model.addAttribute("likeSelect",likeSelect);
//       model.addAttribute("likeVo",likeSelect);
//        return likeSelect;
//
//    }
}
