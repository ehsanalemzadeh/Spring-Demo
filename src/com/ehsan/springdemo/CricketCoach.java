package com.ehsan.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	public CricketCoach(){
		System.out.println("Cricket Coach Constructor - no args");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach fortune setter");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach email setter");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach team setter");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Some cricket daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
