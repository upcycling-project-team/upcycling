package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.*;
import com.example.upcycling.service.CommunityService;
import com.example.upcycling.service.ReplyService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/community")
public class CommunityController {
    private final CommunityService communityService;
    private final ReplyService replyService;

    @GetMapping("/list")
    public String community(Model model, Criteria criteria) {
        List<CommunityVo> communityList = communityService.findList(criteria);
        model.addAttribute("communityList", communityList);

        int total = communityService.findTotal();

        PageVo pageVo = new PageVo(total, criteria);
        model.addAttribute("pageInfo",pageVo);

        return "community/list";
    }



    @GetMapping("/detail")
    public String detail(Model model, Long communityNumber, HttpSession session) {
        CommunityVo communityDetail = communityService.findDetail(communityNumber);

//        Long userNumber = (Long) session.getAttribute("userNumber");

        Long userNumber = 26L;

        String userId = communityService.findId(userNumber);

        model.addAttribute("userId",userId);
        model.addAttribute("communityVo", communityDetail);



        return "community/detail";
    }


    @GetMapping("/write")
    public String writer() {
        return "community/write";
    }

    @PostMapping("/write")
    public RedirectView writer(CommunityDto communityDto, HttpSession session) {
//        Long userNumber = (Long) session.getAttribute("userNumber");

        Long userNumber = 26L;


        communityDto.setUserNumber(userNumber);
        communityService.communityWrite(communityDto);
        return new RedirectView("/community/list");
    }


}
