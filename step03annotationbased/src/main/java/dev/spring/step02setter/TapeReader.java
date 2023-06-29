package dev.spring.step02setter;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	private Tape tape;

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " 정상 동작합니다");
		} else {
			System.out.println(tape.getName() + " 사기 당했습니다");
		}

	}

	public TapeReader() {
		System.out.println("TapeReader 생성자");
	}
	
	@Autowired
	public void setTape(Tape tape) {
		System.out.println("setTape");
		this.tape = tape;
	}


	@Override
	public String toString() {
		return "TapeReader 입니다.";
	}

}
