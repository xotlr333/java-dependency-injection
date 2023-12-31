package dev.spring.step01setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		// 스프링에서 제공해주는 팩토리로 TapeReader에 대한 의존성(인스턴스)을 주입받아야함
		
		// 해야할 일
		// 1. 스프링에서 제공해주는 스프링 컨데이너(팩토리) 생성
		// 2. 컨테이너에게 프로그램 동작 시 사용할 빈(Bean)으로 어떤 것들이 있는지 지정
		
		// 스프링에서 제공해주는 코드
		ApplicationContext context = new ClassPathXmlApplicationContext("setter-config.xml");
		System.out.println(context);
		
		// TapeReader 생성
		TapeReader reader = context.getBean(TapeReader.class);
		
		reader.test();
	}

}
