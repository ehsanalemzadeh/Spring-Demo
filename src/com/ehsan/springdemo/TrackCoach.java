package com.ehsan.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach constructor");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "run more";
	}

	@Override
	public String getDailyFortune() {
		return "Track :" + fortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("init method of TrackCoach");
	}
	
	public void destroyMethod() {
		System.out.println("destroy method of TrackCoach");
	}
}
