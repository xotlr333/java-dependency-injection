package dev.spring.step01setter;

public class TapeReader {

	private Tape tape;

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " ���� �����մϴ�");
		} else {
			System.out.println(tape.getName() + " ��� ���߽��ϴ�");
		}

	}

	

	public void setTape(Tape tape) {
		this.tape = tape;
	}



	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}
