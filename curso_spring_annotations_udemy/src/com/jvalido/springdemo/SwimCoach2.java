package com.jvalido.springdemo;

public class SwimCoach2 implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach2(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
