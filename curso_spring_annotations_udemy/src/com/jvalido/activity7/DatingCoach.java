package com.jvalido.activity7;

public class DatingCoach implements Coach {

	private FortuneService fortuneService;
	
	public DatingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Busca una mujer y cortéjala";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
