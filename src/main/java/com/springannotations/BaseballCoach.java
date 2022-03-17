package com.springannotations;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "baseball coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
