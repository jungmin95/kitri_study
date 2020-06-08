package condition;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int grade = s.nextInt();
		String str = "string";
		str = str + "+";
		
		String score = "";
		switch (grade / 10) {
		case 10:
		case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default :
			score = "F";
			break;
		}
		if ((( grade % 10 >= 5)&&(grade >= 60)) || (grade == 100)) {
			score = score + "+";
		}
		System.out.println(score);
		
		
//		switch(grade /10) {
//		case 10 : 
//			System.out.println("A+");
//			break;
//		case 9 :
//			if (grade % 10 >= 5) {
//				System.out.println("A+");
//			} else {
//			System.out.println("A");
//			}
//			break;
//		case 8 :
//			if (grade % 10 >= 5) {
//				System.out.println("B+");
//			} else {
//			System.out.println("B");
//			}
//			break;
//		case 7 :
//			if ( grade % 10 >= 5 ) {
//				System.out.println("C+");
//			} else {
//			System.out.println("C");
//			}
//			break;
//		case 6 :
//			if ( grade % 10 >= 5) {
//				System.out.println("D+");
//			} else {
//			System.out.println("D");
//			}
//			break;
//		default :
//			System.out.println("F");
//			break;
//		}

	}

}
