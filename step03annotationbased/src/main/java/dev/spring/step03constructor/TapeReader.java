package dev.spring.step03constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	private Tape tape;

	
	@Autowired
	public TapeReader(Tape tape) {
		System.out.println("TapeReader ������");
		this.tape = tape;
	}

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
	
	public void setTape(Tape tape) {
		System.out.println("setTape");
		this.tape = tape;
	}


	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}
