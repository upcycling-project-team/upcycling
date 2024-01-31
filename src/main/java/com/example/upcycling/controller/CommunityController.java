package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.dto.UserDto;
import com.example.upcycling.domain.vo.CommunityCommentVO;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.service.CommunityService;
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

    @GetMapping("/list")
    public String community(Model model) {
        List<CommunityVo> communityList = communityService.findList();
        model.addAttribute("communityList", communityList);

        return "community/list";
    }

    @GetMapping("/detail")
    public String detail(Model model, Long communityNumber, HttpSession session) {
        CommunityVo communityDetail = communityService.findDetail(communityNumber);

//        Long userNumber = (Long) session.getAttribute("userNumber");
        Long userNumber = 8L;
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
        Long userNumber = 8L;

        communityDto.setUserNumber(userNumber);
        communityService.communityWrite(communityDto);
        return new RedirectView("/community/list");
    }

//    @GetMapping("/comment")
//    public @ResponseBody List<CommunityVo> comment(@ModelAttribute CommunityVo communityVo){
//        System.out.println("communityVo = " + communityVo);
//        return null;
//    }
}
