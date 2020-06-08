package condition;

import java.util.Scanner;

public class IfififTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
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
