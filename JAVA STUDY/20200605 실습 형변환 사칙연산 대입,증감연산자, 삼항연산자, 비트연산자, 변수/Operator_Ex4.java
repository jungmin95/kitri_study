package variable;

public class Operator_Ex4 {

	public static void main(String[] args) {
		//상황연산자 := if (조건문)
		// boolean bool = (조건문 (|| &&))?(참) : (거짓);
		boolean bool = (1 != 1) ? true : false;
		System.out.println(bool);

		int in = (1==1)?((1==1)? 20:30):10;
		System.out.println(in);
	}

}
