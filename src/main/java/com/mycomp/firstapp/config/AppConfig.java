package com.mycomp.firstapp.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AppConfig {

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
