package interation;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		do {
//			[실행문]
//		} while {[조건문]};
		int num1, num2, num3;
		do {
			num1 = (int) (Math.random() * 5) +1;
			num2 = (int) (Math.random() * 5) +1;
			num3 = (int) (Math.random() * 5) +1;
			
		} while ((num1 == num2) && (num2 == num3) && (num3 == num1));
		
		System.out.println(num1 + ", " + num2 + ", " + num3);
	}

}
