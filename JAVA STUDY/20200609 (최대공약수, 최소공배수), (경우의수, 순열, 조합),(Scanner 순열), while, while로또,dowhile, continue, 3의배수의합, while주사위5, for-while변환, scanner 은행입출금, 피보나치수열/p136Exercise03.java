package interation;

public class p136Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		for (i = 1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
				continue;
			}
		}
		System.out.println(sum);
		


	}

}
