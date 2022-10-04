package com.jvalido.springdemo;

public class TrackCoach implements Coach {

	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {		
		//use my fortuneService to get a fortune
		return "Just do it!! " + fortuneService.getFortune();
	}

}
