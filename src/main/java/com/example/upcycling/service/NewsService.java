package com.example.upcycling.service;

import com.example.upcycling.domain.dto.CommunityDto;
import com.example.upcycling.domain.vo.CommunityVo;
import com.example.upcycling.domain.vo.NewsVo;
import com.example.upcycling.mapper.CommunityMapper;
import com.example.upcycling.mapper.NewsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class NewsService {
    private final NewsMapper newsMapper;

    public List<NewsVo> findList() {
        return newsMapper.selectList();
    }
    public NewsVo findDetail(Long newsNumber){
        return newsMapper.selectDetail(newsNumber);
    }
}