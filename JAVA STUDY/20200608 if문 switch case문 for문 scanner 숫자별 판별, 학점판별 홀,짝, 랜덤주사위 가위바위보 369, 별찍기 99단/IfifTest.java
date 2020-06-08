package condition;

import java.util.Scanner;

public class IfifTest {

	public static void main(String[] args) {
		/*
		 * if 
		 * 95점이상 A+
		 * 90점이상 A
		 * 85점이상 B+
		 * 80점이상 B
		 * 70이상    C
		 * 60이상    D
		 * 이하        F
		 */
		Scanner s = new Scanner(System.in);
		
		int student = 89;
		if (student >= 95) {
			System.out.println("A+");
		}
		else if(student >= 90) {
			System.out.println("A");
		}
		else if(student >= 85) {
			System.out.println("B+");
		}
		else if (student >= 80 && student <= 90) {
			System.out.println("B");
		}
		else if (student >= 70 && student <= 80) {
			System.out.println("C");
			
		}
		else if (student >= 60 && student <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		//************************************

		if(student >= 90) {
			if (student % 10 >= 5) {
				System.out.println("A+학점 입니다");
			}else {
			System.out.println("A");
			}
		}
		else if (student >= 80 && student <= 90) {
			if (student % 10 >= 5) {
				System.out.println("B+");
			}else {
			System.out.println("B");
			}
		}
		else if (student >= 70 && student <= 80) {
			System.out.println("C");
			
		}
		else if (student >= 60 && student <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		/*
		 * 10의 자리 1 = 내국인 2 = 외국인
		 * 1의 자리 1 = 남자 2 = 여자 3 = 미성년자
		 */
		
		int select = s.nextInt();
		System.out.println("입력하시오 : " + select);
		if (select / 10 == 1) {
			System.out.println("내국인");
			if(select % 10 == 1) {
				System.out.print("남자");
			}else if(select % 10 == 2) {
				System.out.println("여자");
			}
		}
		else {
			System.out.println("외국인");
			if(select % 10 == 1) {
				System.out.print("남자");
			}else if(select % 10 == 2) {
				System.out.println("여자");
			}
		}
		
	}

}
