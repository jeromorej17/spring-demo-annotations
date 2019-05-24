package com.parkview.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;

    public FootballCoach(){
        System.out.println("FootballCoach >> inside default constructor ...");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice throwing and catching for 45 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
