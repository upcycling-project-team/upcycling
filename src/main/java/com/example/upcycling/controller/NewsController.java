package com.example.upcycling.controller;


import com.example.upcycling.domain.vo.NewsVo;
import com.example.upcycling.mapper.NewsMapper;
import com.example.upcycling.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/news")
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/detail")
    public String newsDetail(Model model,Long newsNumber) {
        NewsVo newsVo = newsService.findDetail(newsNumber);

        model.addAttribute("newsVo",newsVo);
        System.out.println("newsVo = " + newsVo);
        return "news/detail";
    }

    @GetMapping("/list")
    public String news(Model model){
        List<NewsVo> newsList = newsService.findList();
        model.addAttribute("newsList",newsList);
        System.out.println("newsList = " + newsList);
        return "news/list";
    }
}
