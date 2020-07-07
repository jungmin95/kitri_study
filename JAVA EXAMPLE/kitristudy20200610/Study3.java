package kitristudy20200610;

public class Study3 {

	public static void main(String[] args) {
		/* 20200608
		 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10
		 */
		int sum = 0;
		for (int i=1; i<=10; i++) {
			int suma = (1+i)*i/2;
			sum += suma;
		}
		System.out.println(sum);
	}

}
