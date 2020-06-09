package interation;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//변수는 외부에서 받아서 사용
		//경우의 수
		System.out.println("n의 값 : ");
		int n = s.nextInt();
		System.out.println("r의 값 : ");
		int r = s.nextInt();
		System.out.print(n + "," + r + " ");
		
		//경우의 수
		int NumOfCase = 1;
		
		for ( int i = 1; i <= r; i++ ) {
			
			NumOfCase *= n;
		}
		System.out.println(NumOfCase);
		
		
		//순열공식
		// 3! = 1*2*3
		int facN = 1;
		int facR = 1;
		int facNminR = 1;
		int fac = 1;
		for (int i = 1; i<=3; i++) {
			fac = fac * i;
		}
		for (int i = 1; i<=n; i++) {
			facN = facN * i;
		}
		for (int i = 1; i<=r; i++) {
			facR = facR * i;
		}
		for (int i = 1; i<= (n-r); i++) {
			facNminR = facNminR * i;
		}
//		for(n = n; n<6; n++) {
//			for(r = r; r<5; r++) {
//				System.out.print(n + "," + r + " ");
//			}
//		}
//		//순열공식
//		System.out.println("n의 값 : ");
//		n = s.nextInt();
//		System.out.println("r의 값 : ");
//		r = s.nextInt();
//		for(n = n ; n<6; n++) {
//			for(r = r; r<5; r++) {
//				if(n!=r) {
//				System.out.print(n + "," + r + " ");
//				}
//			}
//		}
		
		//조합공식
		
	}

}
