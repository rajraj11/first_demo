package com.sample;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 30 minutes daily.";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("From TrackCoach :");
        return fortuneService.getFortune();
    }
}


