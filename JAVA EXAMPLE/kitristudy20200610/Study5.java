package kitristudy20200610;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두개의 주사위를 던졌을때 합이 6이되는 모든 경우의수를 출력
		 */
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i+j)==6) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}

}
