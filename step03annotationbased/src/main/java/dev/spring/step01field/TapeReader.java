package dev.spring.step01field;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	@Autowired // 1. �ʵ带 ���ؼ� ������ ����
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



	public void setTape(Tape tape) {
		System.out.println("setTape");
		this.tape = tape;
	}



	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}
