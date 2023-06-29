package dev.spring.step02factory;

public class Tape {

	String name;
	boolean isWorked;
	
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
	
	
}
