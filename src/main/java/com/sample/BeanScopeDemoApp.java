package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beansScope-applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);

    }
}