package com.jvalido.springdemo;

public interface FortuneService {

	//Declaración de array de fortunes a devolver
	public final String[] fortunes = {"This is your lucky day!", "You can do this, trust yourself!", "Don't lose hope!"};
	
	public String getFortune();
	
}
