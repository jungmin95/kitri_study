package condition;

public class IfDice {

	public static void main(String[] args) {
		int num = (int) (Math.random()*100) +1;
		System.out.println(num);
		
		double dou = Math.random();
//		System.out.println(dou);
		
		int comnum = (int) (Math.random()*3);
		if(comnum == 0) {
			System.out.println("com : 가위");
		}else if(comnum == 1) {
			System.out.println("com : 바위");
		}else {
			System.out.println("com : 보");
		}
		
		int mynum = (int) (Math.random()*3);
		if(mynum == 0) {
			System.out.println("my : 가위");
		}else if(mynum == 1) {
			System.out.println("my : 바위");
		}else {
			System.out.println("my : 보");
		}
		if (comnum == 0) {
			if(mynum == 0) {
				System.out.println("비겼습니다");
			}else if(mynum == 1) {
				System.out.println("my:승리");
			}else if(mynum == 2) {
				System.out.println("com:승리");
			}
		}else if(comnum == 1) {
			if(mynum == 0) {
				System.out.println("com:승리");
			}else if(mynum == 1) {
				System.out.println("비겼습니다");
			}else if(mynum == 2) {
				System.out.println("my:승리");
			}
		}else {
			if(mynum == 0) {
				System.out.println("my:승리");
			}else if(mynum == 1) {
				System.out.println("com: 승리");
			}else if(mynum == 2) {
				System.out.println("비겼습니다");
			}
		}
		/*
		 * GBB 0 가위
		 *     1 바위
		 *     2 보
		 *    COM = 1 바위
		 *    MY =  0 가위
		 */

	}

}
