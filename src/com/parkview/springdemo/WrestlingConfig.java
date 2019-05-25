package com.parkview.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WrestlingConfig {

    @Bean
    public FortuneService stringFortuneService(){
        return new StringFortuneService();
    }

    @Bean
    public Coach wrestlingCoach(){
        return new WrestlingCoach(stringFortuneService());
    }
}
