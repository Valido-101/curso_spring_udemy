package com.jvalido.activity5and6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
class FileFortuneService implements FortuneService {

	private String fileName = "C:/Users/Valido/eclipse_workspaces/spring_course_udemy_workspace/curso_spring_annotations_udemy/src/com/jvalido/activity5and6/fortunes.txt";
	private ArrayList<String> fortunes;
	
	@PostConstruct
	public void readFortunesFile() {
		File fortunesFile = new File(fileName);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fortunesFile));
			
			fortunes = new ArrayList<>();
			
			String tmpLine;
			
			while ((tmpLine = br.readLine()) != null) {
				
				System.out.println(">> FileFortuneService: inside readFortunesFile() -> " + tmpLine);
				fortunes.add(tmpLine);
				
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo");
		} catch (IOException e) {
			System.out.println("Ha habido un error leyendo el archivo " + fileName);
		}
	}
	
	@Override
	public String getFortune() {
		
		Random random = new Random();
		
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
