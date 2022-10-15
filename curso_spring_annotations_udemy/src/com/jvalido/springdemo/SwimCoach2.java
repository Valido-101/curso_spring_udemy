package com.jvalido.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach2 implements Coach {

	private FortuneService fortuneService;
	
	@Value("${sport.email}")
	private String email;
	
	@Value("${sport.team}")
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
