package com.jvalido.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		/*
		 * DIFERENTES TIPOS DE SCOPE
		 * 
		 * El atributo scope de un bean en el archivo de configuración decide
		 * cuántas veces se declarará un bean. Es decir, si cada vez que se obtenga
		 * ese bean será una referencia al mismo objecto o si será una referencia a 
		 * objetos distintos.
		 * 
		 * Los tipos de scope son:
		 * 
		 * singleton -> una referencia al mismo objeto
		 * prototype -> una referencia a un nuevo objeto
		 * request -> se usa en entornos web, explicación más adelante
		 * session -> se usa en entornos web, explicación más adelante
		 * global-session -> se usa en entornos web, explicación más adelante
		 */
		
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the result
		System.out.println("\nPointing to the same object? -> " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach +"\n");
		
		//close the context
		context.close();

	}

}
