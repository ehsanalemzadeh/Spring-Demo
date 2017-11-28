package com.ehsan.springdemo;

public class BaseballCoach implements Coach{
	

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "run 30 minutes";
	}

	@Override
	public String getDailyFortune(){
		return fortuneService.getFortune();
	}
}
