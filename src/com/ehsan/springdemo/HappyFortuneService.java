package com.ehsan.springdemo;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Happy Fortune Service";
	}

}
