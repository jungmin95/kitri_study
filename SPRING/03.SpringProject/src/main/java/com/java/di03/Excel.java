package com.java.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Excel {
	
	
	@Autowired(required = false)
	@Qualifier("print-A")
	Print print;
	
	public Excel() {
		System.out.println("excel 생성");
	}
	public void excelPrint() {
		if (print != null) {
			print.print();
		}else {
			System.out.println("print는 null입니다.");
		}
	}
	
}
