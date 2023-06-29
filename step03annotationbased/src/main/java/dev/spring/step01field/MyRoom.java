package dev.spring.step01field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config-field.xml");
		System.out.println(context);
		
		// TapeReader »ý¼º
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		
		TapeReader reader1 = context.getBean(TapeReader.class);
		System.out.println(reader1);
		
		TapeReader reader2 = context.getBean(TapeReader.class);
		System.out.println(reader2);
		
		reader.test();
	}

}
