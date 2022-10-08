package com.jvalido.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		/*
		 * HOOKS/BEAN LIFECYCLE
		 * 
		 * Estos términos hacen referencia al ciclo de vida de un bean, al cual se le pueden
		 * indicar métodos que se ejecuten al momento de la creación y de la destrucción de un
		 * bean. Cuando se habla de Hook, se refiere a un método que se "ancla" o "engancha" en
		 * la creación o destrucción de un bean. El lifecycle o ciclo de vida np es más que la
		 * referencia a todo lo que hace un bean desde que se crea hasta que se destruye.
		 */
		
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
