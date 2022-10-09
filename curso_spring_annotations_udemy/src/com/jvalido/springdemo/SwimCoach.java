package com.jvalido.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	//definimos propiedades
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//propiedades sacadas del archivo properties
	@Value("${sport.email}")
	private String email;
	
	@Value("${sport.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "Swim for an hour";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	public String getCoachInfo() {
		return "Email -> " + email + "\nTeam -> " + team;
	}

}
