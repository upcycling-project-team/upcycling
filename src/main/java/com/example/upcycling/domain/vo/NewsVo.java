package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class NewsVo {
     private String administratorId;
     private Long administratorNumber;
     private String newsTitle;
     private String newsContent;
     private String  newsSysdate;
     private Long  newsNumber;
     private Long  newsImgNumber;
     private String  newsImgName;
     private String  newsImgUploadPath;
     private String  newsImgUuid;
    }
