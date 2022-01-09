package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach trackCoach=context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkout());


        Coach basketballCoach=context.getBean("myBaseballCoach",Coach.class);
        System.out.println(basketballCoach.getDailyFortune());

        Coach trackCoach2=context.getBean("myTrackCoach",Coach.class);
        System.out.println(trackCoach2.getDailyFortune());

        context.close();
    }
}
