package dev.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.summer.Drink;

public class MyRoom {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		TapeReader reader = context.getBean(TapeReader.class);
		
		reader.test();
	}

}
