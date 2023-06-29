package dev.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML ������ ��������� <bean>�� ���� ������Ʈ�� ������� �ʰ� �ڵ����� bean�� ��ĵ�Ͽ� �����ϴ� ���
		ApplicationContext context = new ClassPathXmlApplicationContext("component-scan-config.xml");
		System.out.println(context);
		
		// TapeReader ����
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		
		reader.test();
	}

}
