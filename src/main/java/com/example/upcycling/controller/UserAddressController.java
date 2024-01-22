package com.example.upcycling.controller;

import com.example.upcycling.service.UserAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserAddressController {
    private final UserAddressService userAddressService;
}
