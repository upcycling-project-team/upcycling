package com.example.upcycling.controller;

import com.example.upcycling.service.DetailActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DetailActivityController {
    private final DetailActivityService detailActivityService;
}
