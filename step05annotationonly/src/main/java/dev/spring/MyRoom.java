package dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.summer.Drink;

public class MyRoom {

	public static void main(String[] args) {
	
		// 1. 별도의 빈 설정용 XML 파일 없이, Annotation만으로 컨테이너에 bean을 등록하고, 구성하는 방식
		// <component-scan base-package-"dev.spring"> 대체
		ApplicationContext context = new AnnotationConfigApplicationContext("dev");
		System.out.println(context);
		
		// TapeReader 생성
		TapeReader reader = context.getBean(TapeReader.class);
		Drink drink = context.getBean(Drink.class);
		System.out.println(drink);
		
		reader.test();
	}

}
