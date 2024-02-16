package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class ReviewVo {
//    ReviewDto랑 ReviewImgDto를 합침
    private Long reviewNumber;
    private Long userNumber;
    private Long productNumber;
    private Long administratorNumber;
    private String reviewTitle;
    private String reviewContent;
    private String reviewSysdate;
    private Long reviewRate;
    private String userId;

    private Long reviewImgNumber;
    private String reviewImgName;
    private String reviewImgUploadPath;
    private String reviewImgUuid;
}
