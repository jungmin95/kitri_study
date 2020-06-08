package condition;

public class ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
//		for (int i = 1; i <= 6; i++) {
//			for ( int j = 1; j < i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		//풀이
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 		*
		 * 	   **
		 *    ***
		 *   ****
		 *  *****
		 */
//		for (int i = 1; i <=5; i++) {
//			for(int j = 5; j > 0; j--) {
//				if ( i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		//풀이
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
