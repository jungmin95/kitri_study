package interation;

public class p136Exercise05 {
	public static void main(String[] args) {
		
//		for(int i = 1; i <= 60; i++) {
//			for(int j = 1; j <=60; j++) {
//				if((4*i) + (6*j) == 60) {
//					System.out.print(" i : " + i);
//					System.out.print(" j : " + j);
//				}
//			}
//		}
		//Ç®ÀÌ
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.printf("(%d,  %d)", x , y);
				}
			}
		}
	}
}
