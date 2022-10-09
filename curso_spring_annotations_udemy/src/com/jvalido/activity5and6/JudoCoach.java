package com.jvalido.activity5and6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class JudoCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "A partir maderas durante una hora";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
