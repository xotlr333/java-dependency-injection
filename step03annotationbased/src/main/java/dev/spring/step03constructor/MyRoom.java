package dev.spring.step03constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config-constructor.xml");
		System.out.println(context);
		
		// TapeReader »ý¼º
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		
		
		reader.test();
	}

}
