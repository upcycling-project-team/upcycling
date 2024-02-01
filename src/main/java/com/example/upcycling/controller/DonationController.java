package com.example.upcycling.controller;

import com.example.upcycling.service.OnlineDonationService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/donation")
@RequiredArgsConstructor
public class DonationController {
    private final OnlineDonationService onlineDonationService;

    @GetMapping("/donation-online")
    public String donationOnline(){
        return "donation/donation-online";
    }

    @GetMapping("/donation-offline")
    public String donationOffline(){
        return "donation/donation-offline";
    }


    @PostMapping("/donation-online")
    public String donationOnline(@RequestParam("material") List<String> materials,
                                 String idAgree, String keyringAgree,
                                 HttpSession session){
        System.out.println("materials = " + materials + ", idAgree = " + idAgree + ", keyringAgree = " + keyringAgree);
        Long userNumber = (Long) session.getAttribute("userNumber");
//        Long userNumber = 1L;
        onlineDonationService.register(materials, idAgree, keyringAgree, userNumber);


        return "donation/donation-thanks";
    }
    @GetMapping("/donation-thanks")
    public String donationThanks(){
        return "main/main";
    }
}
