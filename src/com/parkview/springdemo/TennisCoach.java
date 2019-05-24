package com.parkview.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements Coach {

    private FortuneService fortuneService;


    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("TennisCoach:  Inside constructor method!");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
