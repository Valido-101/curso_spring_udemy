package com.jvalido.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Si indicamos un id junto con la anotación @Component, spring usará ese id
//@Component("thatSillyCoach")
//Si no indicamos un id, spring le asignará uno por defecto que será el nombre de la clase en CamelCase
@Component
//Con Scope definimos las veces que se crea un bean
@Scope("singleton")
public class TennisCoach implements Coach {

	//Field injection con Autowired, esta anotación hace maravillas, lo mismo que si lo usas en el setter o el constructor
	//Cuando haya más de una clase que implemente esta interfaz debemos usar la anotación Qualifier para concretar cuál
	//debe usar Spring
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/*
	 * ATENCIÓN
	 * 
	 * Para java 9 o superior, estas anotaciones de PostConstruct y PreDestroy no existen, hay que descargar la librería de annotations
	 * (javax.annotation-api-1.3.2.jar) e incluirla en el buildpath
	 */
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside doMySTartupStuff()");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanupStuff()");
	}
	
	/*
	//Con la anotación @Autowired cualquier método puede usarse para inyectar dependencia, no solo un setter o un constructor
	@Autowired
	public void inyectarDependencia(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside inyectarDependencia() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	//define setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortune() method");
		this.fortuneService = fortuneService;
	}
	*/
	/*
	//Esta anotación escanea el paquete hasta que encuentre una clase que implementa la interfaz del parámetro para añadirla al constructor
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
