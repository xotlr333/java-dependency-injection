package dev.spring.step01dependency;

public class TapeReader {
	
	Tape tape;
	
	public void test() {
		// TODO Auto-generated method stub
		tape = new Tape("아일랜드", true);
		
		if(tape.isWorked()) {
			System.out.println(tape.getName() + " 정상 동작합니다.");
			
		}else {
			System.out.println(tape.getName() + " 사기 당했습니다.");
		}

	}
	
	
}
