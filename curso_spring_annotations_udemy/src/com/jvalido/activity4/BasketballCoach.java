package com.jvalido.activity4;

import org.springframework.stereotype.Component;

@Component
class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your free throw for half an hour";
	}

}
