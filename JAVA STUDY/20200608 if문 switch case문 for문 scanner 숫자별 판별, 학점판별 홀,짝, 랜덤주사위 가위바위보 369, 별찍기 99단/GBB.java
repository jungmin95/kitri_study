package condition;

import java.util.Scanner;

public class GBB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		int result = -1;
		
		
		System.out.println("내가 낼것?");
		int my = s.nextInt();
		System.out.println(com + " " + my);
		if ( com == 0 ) {
			System.out.println("com : 가위");
		} else if ( com == 1 ) {
			System.out.println("com : 바위");
		} else if ( com == 2 ) { 
			System.out.println("com : 보");
		}
		if ( my == 0 ) {
			System.out.println("my : 가위");
		} else if ( my == 1 ) {
			System.out.println("my : 바위");
		} else if ( my == 2 ) { 
			System.out.println("my : 보");
		}
		result = (com-my+2)%3;
		//0 com, 1 my, 2 비김
		if ( result == 0 ) {
			System.out.println("com 이겼습니다.");
		}else if ( result == 1) {
			System.out.println("my 이겼습니다");
		}else if ( result == 2) { 
			System.out.println("비겼습니다");
		}
	}
}
