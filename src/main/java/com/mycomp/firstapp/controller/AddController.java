package com.mycomp.firstapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddController {

    private static final Logger logger = LoggerFactory.getLogger(AddController.class);

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        logger.info("Received request to add: a = {}, b = {}", a, b);
        int result = a + b;
        logger.info("Result of addition: {}", result);
        return result;
    }
    
    @GetMapping()
    public String get() {
        return "Hello Good Morning Akanksha";
    }
}
