package dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.summer.Drink;

public class MyRoom {

	public static void main(String[] args) {
	
		// 1. ������ �� ������ XML ���� ����, Annotation������ �����̳ʿ� bean�� ����ϰ�, �����ϴ� ���
		// <component-scan base-package-"dev.spring"> ��ü
		ApplicationContext context = new AnnotationConfigApplicationContext("dev");
		System.out.println(context);
		
		// TapeReader ����
		TapeReader reader = context.getBean(TapeReader.class);
		Drink drink = context.getBean(Drink.class);
		System.out.println(drink);
		
		reader.test();
	}

}
