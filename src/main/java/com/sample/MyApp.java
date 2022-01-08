package com.sample;

public class MyApp {
     public static void main(String[] args) {
          Coach c1=new BaseballCoach();
          Coach c2=new TrackCoach();
          System.out.println(c1.getDailyWorkout());
          System.out.println(c2.getDailyWorkout());

     }
}
