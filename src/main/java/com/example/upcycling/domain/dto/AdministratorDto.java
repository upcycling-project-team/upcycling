package com.example.upcycling.domain.dto;

import lombok.Data;

@Data
public class AdministratorDto {
    private Long administratorNumber;
    private String administratorId;
    private String administratorPassword;
    private String administratorName;
    private Long administratorAuth;
}
