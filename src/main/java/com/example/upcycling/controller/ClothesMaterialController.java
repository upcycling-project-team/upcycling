package com.example.upcycling.controller;

import com.example.upcycling.service.ClothesMaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ClothesMaterialController {
    private final ClothesMaterialService clothesMaterialService;
}
