package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("----------------- application context xml file read ------------------------------");
        Coach trackCoach=context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkout());



        System.out.println("-----------------------------Constructor Injection-------------------------------");

        Coach basketballCoach=context.getBean("myBaseballCoach",Coach.class);
        System.out.println(basketballCoach.getDailyFortune());

        Coach trackCoach2=context.getBean("myTrackCoach",Coach.class);
        System.out.println(trackCoach2.getDailyFortune());


        System.out.println("----------------------------Setter Injection ------------------------------");

        CricketCoach cricketCoach=context.getBean("myCricketCoach",CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        System.out.println("----------------------Reading from properties file -----------------");
        cricketCoach=context.getBean("myCricketCoachProp",CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());
        context.close();
    }
}
