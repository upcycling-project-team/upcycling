package com.example.upcycling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/donation")

public class DonationController {

    @GetMapping("donation-online")
    public String donationOnline(){
        return "donation/donation-online";
    }

    @GetMapping("donation-offline")
    public String donationOffline(){
        return "donation/donation-offline";
    }

}
