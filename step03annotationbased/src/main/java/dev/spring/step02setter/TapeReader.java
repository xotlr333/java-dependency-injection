package dev.spring.step02setter;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	private Tape tape;

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " ���� �����մϴ�");
		} else {
			System.out.println(tape.getName() + " ��� ���߽��ϴ�");
		}

	}

	public TapeReader() {
		System.out.println("TapeReader ������");
	}
	
	@Autowired
	public void setTape(Tape tape) {
		System.out.println("setTape");
		this.tape = tape;
	}


	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}
