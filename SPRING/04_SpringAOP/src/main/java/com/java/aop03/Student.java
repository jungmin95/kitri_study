package com.java.aop03;

import java.util.Scanner;

public class Student implements Person{
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("학생을 공부를 합니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int su = sc.nextInt();
		
		if(su == 5) {
			System.out.println(su/0);
		}
		sc.close();
	}
	
}
