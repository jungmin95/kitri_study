package com.java.di03;

import org.springframework.stereotype.Component;

@Component("print-B")
public class PrintB implements Print{
		
	@Override
	public void print() {
		System.out.println("printB입니다.");
		
	}
}
