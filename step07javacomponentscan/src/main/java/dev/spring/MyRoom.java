package dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		TapeReader reader = context.getBean(TapeReader.class);
		
		TapeReader reader2 = context.getBean(TapeReader.class);
		
		TapeReader reader3 = context.getBean(TapeReader.class);
		
		reader.test();
	}

}
