package dev.spring.step02setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Tape {
	private String name; // 테이프 이름
	private boolean isWorked; // 정상 동작 여부

	public Tape() {
		super();
		System.out.println("Tape() called");
	}

	public Tape(String name, boolean isWorked) {
		super();
		this.name = name;
		this.isWorked = isWorked;
	}

	public String getName() {
		return name;
	}

	public boolean isWorked() {
		return isWorked;
	}
	
	@Autowired
	public void setName(@Value("아일랜드") String name) {
		System.out.println("setName(String name) called()");
		this.name = name;
	}


	@Autowired
	public void setWorked(@Value("true") boolean isWorked) {
		System.out.println("setWorked(boolean isWorked) called()");
		this.isWorked = isWorked;
	}
}
