package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.service.FaqService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//실험중
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/faq")
public class FaqController {
    private final FaqService faqService;

    @GetMapping("/main")
    public String faq01(Model model){
        List<FaqDto> faqTitleList2 = faqService.selectAll();

        model.addAttribute("titleList", faqTitleList2);
        return "faq/faq01";
    }

    @GetMapping("/search-result")
    public String faq02(String keyword, Model model){
        System.out.println("keyword = " + keyword);
        List<FaqDto> faqTitleList = faqService.findSearch(keyword);

        model.addAttribute("keyword", keyword);
        model.addAttribute("titleList", faqTitleList);

        return "faq/faq02";
    }

    @GetMapping("/detail")
    public String faq03(Long faqNumber, Model model)
    {
        FaqDto board = faqService.findBoard(faqNumber);
//        FaqDto board2 = faqService.findBoardLeft(faqNumber);
//        FaqDto board3 = faqService.findBoardRight(faqNumber);
//        FaqDto board4 = faqService.findBoardMax(faqNumber);
        model.addAttribute("board", board);
//        model.addAttribute("board2",board2);
//        model.addAttribute("board3",board3);
//        model.addAttribute("board4",board4);
        return "faq/faq03";
    }


}












