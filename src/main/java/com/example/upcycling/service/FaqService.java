package com.example.upcycling.service;

import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.mapper.FaqMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FaqService {
    private final FaqMapper faqMapper;

    //    게시물 단건 조회
    public List<String> findSearch(String keyword){
        List<String> faqTitleList = faqMapper.selectSearch(keyword);

        return faqTitleList;
    }
}
