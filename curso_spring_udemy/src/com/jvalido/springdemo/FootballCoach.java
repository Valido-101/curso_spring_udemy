package com.jvalido.springdemo;

public class FootballCoach implements Coach {

	//define private field for the dependency
		private FortuneService fortuneService;
		
	//define a constructor for dependency injection
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public FootballCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Párteles la madre a tus compañeros, perro";
	}

	@Override
	public String getDailyFortune() {		
		//use my fortuneService to get a fortune
		return "Come on!! " + fortuneService.getFortune();
	}

}
