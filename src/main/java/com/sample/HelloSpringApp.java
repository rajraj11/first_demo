package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach trackCoach=context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkout());
        context.close();
    }
}
