package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class CommunityVo {
   private Long communityNumber;
   private String communityTitle;
   private String communityContent;
   private String userId;
   private Long userNumber;
   private String communitySysdate;
   private Long communityViewCount;
}
