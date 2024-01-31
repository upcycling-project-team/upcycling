package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class CommunityDto {
    private Long communityNumber;
    private String communityTitle;
    private String communityContent;
    private String communitySysdate;
    private Long userNumber;
    private Long communityViewCount;
}
