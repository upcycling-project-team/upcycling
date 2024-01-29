package com.example.upcycling.controller;

import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.service.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//실험중
import org.springframework.web.bind.annotation.RequestParam;

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
        Optional<FaqDto> board =faqService.findBoard(faqNumber);
        model.addAttribute("board", board);
        return "faq/faq03";
    }

    @GetMapping("/write")
    public String faq04(){
        return "faq/faq04";
    }

}
