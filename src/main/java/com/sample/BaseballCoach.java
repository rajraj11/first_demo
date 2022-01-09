package com.sample;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return  "Spend 30 minutes on Practicing Baseball.";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("From BaseballCoach :");
        return fortuneService.getFortune();
    }

}
