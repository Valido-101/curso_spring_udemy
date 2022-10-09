package com.jvalido.activity5and6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity5and6DemoApp {

	public static void main(String[] args) {
		
		//load context
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/jvalido/activity5and6/activity5and6-applicationContext.xml");
		
		//retrieve beans
		Coach judoCoach = context.getBean("judoCoach", Coach.class);
		
		//call methods
		System.out.println(judoCoach.getDailyWorkout());
		
		System.out.println(judoCoach.getFortune());
		
		//close context
		context.close();
		
	}

}
