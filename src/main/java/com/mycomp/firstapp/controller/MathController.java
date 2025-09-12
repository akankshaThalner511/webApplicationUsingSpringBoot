package com.mycomp.firstapp.controller;

import com.mycomp.firstapp.service.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private static final Logger logger = LoggerFactory.getLogger(MathController.class);

    private final MathService mathService;
    private final Random random;

    public MathController(MathService mathService, Random random) {
        this.mathService = mathService;
        this.random = random;
        logger.info("MathController initialized with Random: {}", random);
    }

    
	/*
	 * @PostMapping("/add") public String add() { return "Hello Akanksha"; }
	 */
    
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        int randomValue = random.nextInt(100);
        logger.info("Random value generated: {}", randomValue);
        return mathService.add(a, b);
    }
}
