package interation;

public class NumberOfCase {

	public static void main(String[] args) {
		/*
		 * A학생 1~5
		 * B학생 1~5
		 * C학생 1~5
		 * 5 * 5 * 5 = 경우의수 125가지
		 * 5 * 4 * 3 = 순열 경우의수 60가지
		 * 1,2,3 = 3,2,1 조합
		 */
		
		int countCase = 0;
		int countP = 0;
		int countC = 0;
		
		
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					System.out.print(" " + i + "," + j + "," + k);
					countCase++;
				}
			}
			System.out.println();
		}
		System.out.println("경우의 수 : " + countCase);
		System.out.println();
		
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					if(i != j && j != k && i != k) {
						System.out.print(" " + i + "," + j + "," + k);
						countP++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("순열의 수 : " + countP);
		for(int i = 1; i < 6; i ++) {
			for(int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					if((i<j)&&(j<k)&&(i<k)) {
						System.out.print(" " + i + "," + j + "," + k);
						countC++;
					}
				}
			}
			System.out.println();
		}
		System.out.println("조합의 수 : " + countC);
	}

}
