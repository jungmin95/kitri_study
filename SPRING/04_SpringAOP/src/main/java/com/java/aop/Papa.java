package com.java.aop;

public class Papa implements Person{

	@Override
	public void awake() {
		System.out.println("일어 난다");
		
	}

	@Override
	public void work() {
		System.out.println("출근을 한다");
		
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잔다.");
		
	}

}
