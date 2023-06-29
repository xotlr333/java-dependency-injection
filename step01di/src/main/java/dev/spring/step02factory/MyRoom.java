package dev.spring.step02factory;

public class MyRoom {

	public static void main(String[] args) {
		// myRoom���� TapeReader�� ���� �������� ���ߴ� ���
		// -> MyRoom.java���� new�� ������� �ʰ� ,TapReader�� �����Ͽ� ����ϴ� ���?
		
		// ��������: MyRoom���� new TapeReader()�� �Ⱦ��� ��
		TapeReader reader = TapeReaderFactory.createTapeReader();
		reader.test();

	}

}
