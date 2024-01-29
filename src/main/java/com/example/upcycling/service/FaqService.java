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

    //    키워드가 들어간 질문목록 조회
    public List<FaqDto> findSearch(String keyword){
        List<FaqDto> faqTitleList = faqMapper.selectSearch(keyword);

        return faqTitleList;
    }
    //  질문 목록 전부 다 보여주기
    public List<FaqDto> selectAll(){
        List<FaqDto> faqTitleList2 = faqMapper.selectAll();

        return faqTitleList2;
    }
    //  게시글 제목
    public Optional<FaqDto> findBoard(Long faqNumber){
        return faqMapper.selectBoard(faqNumber);
    }
}
