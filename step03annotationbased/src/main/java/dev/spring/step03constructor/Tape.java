package dev.spring.step03constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Tape {
	private String name; // ������ �̸�
	private boolean isWorked; // ���� ���� ����

	public Tape() {
		super();
		System.out.println("Tape() called");
	}

	@Autowired
	public Tape(@Value("���Ϸ���") String name, @Value("true") boolean isWorked) {
		System.out.println("Tape ������");
		this.name = name;
		this.isWorked = isWorked;
	}

	public String getName() {
		return name;
	}

	public boolean isWorked() {
		return isWorked;
	}
	
	public void setName(String name) {
		System.out.println("setName(String name) called()");
		this.name = name;
	}

	public void setWorked(boolean isWorked) {
		System.out.println("setWorked(boolean isWorked) called()");
		this.isWorked = isWorked;
	}
}
