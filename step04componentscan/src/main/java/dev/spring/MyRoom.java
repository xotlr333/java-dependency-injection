package dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML 파일을 사용하지만 <bean>과 같은 엘리먼트도 사용하지 않고 자동으로 bean을 스캔하여 적용하는 방식
		ApplicationContext context = new ClassPathXmlApplicationContext("component-scan-config.xml");
		System.out.println(context);
		
		// TapeReader 생성
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		
		reader.test();
	}

}
