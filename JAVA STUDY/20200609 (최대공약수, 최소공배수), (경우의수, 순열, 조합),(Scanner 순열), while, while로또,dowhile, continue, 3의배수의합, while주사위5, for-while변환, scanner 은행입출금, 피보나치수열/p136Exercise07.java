package interation;

import java.util.Scanner;

public class p136Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료.");
			System.out.println("------------------------------");
			System.out.println("선택 >");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("예금액 > ");
				int deposit = scanner.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.print("출금액 > " );
				int out = scanner.nextInt();
				
				if(balance < out) {
					System.out.print("잔고보다 많이 출금할순 없습니다.");
				}else {
					balance -= out;
				}
				break;
			case 3:
				System.out.println("잔고 >");
				System.out.println("잔고 > " + balance);
				break;
				
			case 4:
				run = false;
				break;
			}
			
			
		}
	}

}
