package com.parkview.springdemo;

public class WrestlingCoach implements Coach {
    private FortuneService fortuneService;

    public WrestlingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice defensive moves for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
