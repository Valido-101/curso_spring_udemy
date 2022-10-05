package com.jvalido.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	//Declaración de array de fortunes a devolver
	public final String[] fortunes = {"This is your lucky day!", "You can do this, trust yourself!", "Don't lose hope!"};
	
	@Override
	public String getFortune() {
		//Generamos número aleatorio del 1 al 3
		Random random = new Random();
		
		//Devolvemos una posición aleatoria del array entre 0 y 2
		return fortunes[random.nextInt(3)];
	}

}
