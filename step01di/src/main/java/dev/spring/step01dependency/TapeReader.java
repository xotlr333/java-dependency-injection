package dev.spring.step01dependency;

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
