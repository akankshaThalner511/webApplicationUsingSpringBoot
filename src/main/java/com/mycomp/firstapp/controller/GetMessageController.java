package com.mycomp.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageController {

    // root path `/` ko map kar diya
    @GetMapping("/")
    public String getMorningMessage() {
        return "Good Morning!";
    }
}
