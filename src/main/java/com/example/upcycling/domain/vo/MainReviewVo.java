package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class MainReviewVo {
    private Long reviewNumber;
    private String reviewTitle;
    private String reviewContent;
    private Integer reviewRate;
    private String reviewSysdate;
    private Long reviewImgNumber;
    private String reviewImgName;
    private String reviewImgUploadPath;
    private String reviewImgUuid;
}
