package com.jvalido.springdemo;

import org.springframework.stereotype.Component;

//Si indicamos un id junto con la anotación @Component, spring usará ese id
//@Component("thatSillyCoach")
//Si no indicamos un id, spring le asignará uno por defecto que será el nombre de la clase en CamelCase
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
