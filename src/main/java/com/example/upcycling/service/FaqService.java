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
    //  게시글 제목과 답변을 보여주기
    public FaqDto findBoard(Long faqNumber){
        return faqMapper.selectBoard(faqNumber)
                .orElseThrow(() -> new IllegalStateException("존재하지 않는 게시물입니다."));
    }
    //  이전 글 제목 조회
    public FaqDto findBoardLeft(Long faqNumber){
        return faqMapper.selectBoardLeft(faqNumber).orElse(null);
    }
    // 다음 글 제목 조회
    public FaqDto findBoardRight(Long faqNumber){
        return faqMapper.selectBoardRight(faqNumber).orElse(null);
    }
    // 마지막 글 faq넘버 조회
    public FaqDto findBoardMax(Long faqNumber){
        return faqMapper.selectBoardMax(faqNumber).orElse(null);
    }
    // 게시글 작성하기
    public void register(FaqDto faqDto){
        faqMapper.insert(faqDto);
    }
}
