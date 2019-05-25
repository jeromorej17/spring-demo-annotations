package com.parkview.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach  implements Coach {

    private FortuneService fortuneService;


    @Autowired
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        System.out.println("TennisCoach:  Inside constructor method!");
        this.fortuneService = fortuneService;
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennnisCoach: inside of doMyStartupStuff() method ....");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside doMyCleanupStuff() method ...");
    }
}
