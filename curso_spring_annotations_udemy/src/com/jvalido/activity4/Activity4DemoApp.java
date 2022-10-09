package com.jvalido.activity4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity4DemoApp {

	public static void main(String[] args) {
		
		//load context
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("com/jvalido/activity4/activity4-applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("basketballCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
		
	}

}
