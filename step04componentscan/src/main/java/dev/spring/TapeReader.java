package dev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TapeReader {

	private Tape tape;

	// Tape�� ���� �������� �Ű������� �ִ� �����ڸ� ���� ����
	public TapeReader(Tape tape) {
		System.out.println("TeapReader ������");
		this.tape = tape;
	}

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " ���� �����մϴ�");
		} else {
			System.out.println(tape.getName() + " ��� ���߽��ϴ�");
		}

	}

	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}
