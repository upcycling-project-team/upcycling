package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class ClothesMaterialDto {
    private Long clothesNumber;
    private String clothesMaterialName;

    private String clothesMaterialDenim;
    private String clothesMaterialLeather;
    private String clothesMaterialCotton;

}
