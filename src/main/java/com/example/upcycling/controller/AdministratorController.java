package com.example.upcycling.controller;

import com.example.upcycling.service.AdministratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AdministratorController {
    private final AdministratorService administratorService;
}
