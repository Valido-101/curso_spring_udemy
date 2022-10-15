package com.jvalido.activity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Activity7Config {

	@Bean
	public FortuneService hardcodedFortuneService() {
		return new HardcodedFortuneService();
	}
	
	@Bean
	public Coach datingCoach() {
		return new DatingCoach(hardcodedFortuneService());
	}
	
}
