package com.example.upcycling.controller;

import com.example.upcycling.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyService replyService;
}
