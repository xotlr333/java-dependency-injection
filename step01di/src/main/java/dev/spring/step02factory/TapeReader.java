package dev.spring.step02factory;

public class TapeReader {
	
	Tape tape;
	
	public void test() {
		// TODO Auto-generated method stub
		tape = new Tape("���Ϸ���", true);
		
		if(tape.isWorked()) {
			System.out.println(tape.getName() + " ���� �����մϴ�.");
			
		}else {
			System.out.println(tape.getName() + " ��� ���߽��ϴ�.");
		}

	}
	
	
}
