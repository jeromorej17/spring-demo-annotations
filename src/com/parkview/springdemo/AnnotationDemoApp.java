package com.parkview.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        Coach theCoach2 = context.getBean("basketballCoach", Coach.class);
        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());

        Coach theCoach3 = context.getBean("footballCoach", Coach.class);
        System.out.println(theCoach3.getDailyWorkout());
        System.out.println(theCoach3.getDailyFortune());

        SwimCoach theCoach4 = context.getBean("swimCoach", SwimCoach.class);
        System.out.println("Coach's Email: " + theCoach4.getEmail());
        System.out.println("The team name:  " + theCoach4.getTeam());
        System.out.println(theCoach4.getDailyWorkout());
        System.out.println(theCoach4.getDailyFortune());

        Coach theCoach5 = context.getBean("hockeyCoach", Coach.class);
        System.out.println(theCoach5.getDailyWorkout());
        System.out.println(theCoach5.getDailyFortune());

        // close the context
        context.close();
    }
}
