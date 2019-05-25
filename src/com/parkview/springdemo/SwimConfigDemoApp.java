package com.parkview.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach theCoach4 = context.getBean("swimCoach", SwimCoach.class);
        System.out.println("Email: " + theCoach4.getEmail());
        System.out.println("Team:  " + theCoach4.getTeam());
        System.out.println(theCoach4.getDailyWorkout());
        System.out.println(theCoach4.getDailyFortune());

        // close the context
        context.close();
    }
}
