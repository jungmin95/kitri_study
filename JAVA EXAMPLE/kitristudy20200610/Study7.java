package kitristudy20200610;

public class Study7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
		 * 만 일 변수 num의 값이 12345라면, 
		 * ‘1+2+3+4+5’의 결과인 15를 출력하라
		 */
		
		int num = 1234; int sum = 0; 
		 
		// ** 코드 작성 ** 
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum="+sum); 
	}

}
