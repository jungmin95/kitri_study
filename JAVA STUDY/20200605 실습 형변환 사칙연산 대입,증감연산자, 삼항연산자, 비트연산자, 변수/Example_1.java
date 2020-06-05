package variable;

import java.util.Scanner;

public class Example_1 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		/* 20200605
		 * 삼항연산자 사용
		 * student = 89
		 * 90점이상 A
		 * 80점이상 B
		 * 70점이상 C
		 * 60점이상 D
		 * 이하        F
		 */
		int student = 89;
		
		char c = (student >= 90)?((student >= 80 && student <=90)? 'B':'C'): 'B';
		
		
		char score = (student >= 90)? 'A':
					 (student <= 90 && student >= 80)? 'B':
					 (student <= 80 && student >= 70)? 'C':
					 (student <= 70 && student >= 60)? 'D':
						 								'F';
		
		System.out.println("학생의 점수는" + score + "학점 입니다");

		/*
		 * number = 10
		 * 짝수 홀수 판별
		 */
		
		int number = 10;
		
		boolean numbering = (number % 2 == 0)? true:false;
		
		System.out.println("짝수가" + numbering + "입니다");
		
		
		

	}
}
