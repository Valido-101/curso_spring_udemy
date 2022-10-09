package com.jvalido.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.jvalido.springdemo")
public class SportConfig {

	
	
	/*
	 * ATENCIÓN
	 * 
	 * Para la configuración de Beans en una clase java se necesitan MÉTODOS.
	 * 
	 * Los id de los beans que declaremos serán los nombres de dichos métodos, que devolverán
	 * una nueva instancia de la clase que queramos usando su constructor.
	 */
	
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach2() {
		return new SwimCoach2(sadFortuneService());
	}
	
	//define bean for our swim coach AND inject dependency

	
}
