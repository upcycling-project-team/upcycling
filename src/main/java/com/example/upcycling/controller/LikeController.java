package com.example.upcycling.controller;

import com.example.upcycling.domain.vo.LikeVo;
import com.example.upcycling.service.LikeService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {
    private final LikeService likeService;


    @PostMapping("/insert")
    public RedirectView insert(LikeVo likeVo, HttpSession session){
//     Long userNumber = (Long)session.getAttribute("userNumber");
        Long userNumber = 8L;
        likeVo.setUserNumber(userNumber);
        likeService.insertLike(likeVo);
        return new RedirectView("like/insert") ;
    }

    @DeleteMapping("/delete")
    public void delete(Long communityNumber,Long userNumber){
        likeService.deleteLike(userNumber,communityNumber);
    }
    @GetMapping("/select")
    public int select(Model model,Long communityNumber,Long userNumber ,HttpSession session){
        int likeSelect = likeService.selectLike(userNumber,communityNumber);
//        userNumber=(Long)session.getAttribute("userNumber");
       model.addAttribute("likeSelect",likeSelect);
        return likeSelect;

    }
}
