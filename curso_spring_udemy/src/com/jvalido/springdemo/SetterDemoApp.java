package com.jvalido.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		CricketCoach coach = context.getBean("myCricketCoachRandomFortune", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		//call methods to get literal values
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getTeam());
		
		//close context
		context.close();
	}

}
