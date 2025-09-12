package com.mycomp.firstapp.service.impl;

import com.google.gson.Gson;
import com.mycomp.firstapp.dto.MyRequestDto;
import com.mycomp.firstapp.service.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    private static final Logger logger = LoggerFactory.getLogger(MathServiceImpl.class);
    private final Gson gson;

    public MathServiceImpl(Gson gson) {
        this.gson = gson;
        logger.info("MathServiceImpl initialized: {}", this);
    }

    @Override
    public int add(int val1, int val2) {
        logger.info("Adding numbers: a = {}, b = {}", val1, val2);

        MyRequestDto dto = new MyRequestDto(val1, val2);
        String json = gson.toJson(dto);

        logger.info("Request DTO as JSON: {}", json);
        int sum = val1 + val2;
        logger.info("Sum is: {}", sum);
        return sum;
    }
}
