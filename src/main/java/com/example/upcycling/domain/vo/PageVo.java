package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class PageVo {
    private int pageCnt; // 페이지 당 하단 표시 갯수
    private int startPage; // 세트의 시작 숫자
    private int endPage; // 세트의 마지막 숫자
    private int realEnd; // 전체 페이지 중 가장 마지막 숫자
    private boolean prev; // 이전 버튼 표시 여부
    private boolean next; // 다음 버튼 표시 여부
    private int total; // 전체 게시글 수
    private Criteria criteria;

    public PageVo(int total, Criteria criteria) {
        this(5, total, criteria);
    }

    public PageVo(int pageCnt, int total, Criteria criteria) {
        this.pageCnt = pageCnt;
        this.total = total;
        this.criteria = criteria;

//        현재 페이지를 기준으로 세트의 마지막 번호, 시작 번호를 구한다.
//        ceil() : 올림 처리
        this.endPage = (int)(Math.ceil(criteria.getPage() / (double)pageCnt)) * pageCnt;
        this.startPage = endPage - pageCnt + 1;

//        게시글 전체 개수로 실제 마지막 페이지를 구한다.
        this.realEnd = (int)Math.ceil((double)total / criteria.getAmount());

//        세트의 마지막 번호보다 실제 마지막 페이지가 적다면
        if(realEnd < endPage){
//            세트의 마지막 번호를 실제 마지막 페이지로 교체한다.
            this.endPage = realEnd == 0 ? 1 : realEnd;
        }

        this.prev = startPage > 1;
        this.next = endPage < realEnd;
    }


}
