package com.jvalido.activity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Activity7DemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Activity7Config.class);
		
		Coach coach = context.getBean("datingCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getFortune());
		
		context.close();

	}

}
