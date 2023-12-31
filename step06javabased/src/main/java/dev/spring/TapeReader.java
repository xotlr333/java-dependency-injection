package dev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TapeReader {

	private Tape tape;
	
	public TapeReader() {
		// TODO Auto-generated constructor stub
	}

	// Tape에 대한 의존성을 매개변수가 있는 생성자를 통해 주입
	public TapeReader(Tape tape) {
		System.out.println("TeapReader 생성자");
		this.tape = tape;
	}

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " 정상 동작합니다");
		} else {
			System.out.println(tape.getName() + " 사기 당했습니다");
		}

	}

	@Override
	public String toString() {
		return "TapeReader 입니다.";
	}

}
