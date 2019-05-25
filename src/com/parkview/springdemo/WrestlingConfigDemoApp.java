package com.parkview.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WrestlingConfigDemoApp {

    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WrestlingConfig.class);

        Coach theCoach4 = context.getBean("wrestlingCoach", Coach.class);
        System.out.println(theCoach4.getDailyWorkout());
        System.out.println(theCoach4.getDailyFortune());

        // close the context
        context.close();
    }
}
