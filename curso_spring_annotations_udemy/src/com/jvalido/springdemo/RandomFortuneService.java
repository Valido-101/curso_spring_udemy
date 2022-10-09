package com.jvalido.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of String
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	//create a random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = random.nextInt(data.length);
		
		//index it into the array and get a random fortune
		String theFortune = data[index];
		
		return theFortune;
	}

}
