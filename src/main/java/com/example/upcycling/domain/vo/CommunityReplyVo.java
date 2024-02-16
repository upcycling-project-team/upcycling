package com.example.upcycling.domain.vo;

import lombok.Data;

@Data
public class CommunityReplyVo {
    private Long communityNumber;
    private Long communityReplyNumber;
    private String communityReplyContent;
    private Long userNumber;
    private String userId;
    private String userProfileUploadPath;
    private String userProfileUuid;
    private String userProfileName;
}


