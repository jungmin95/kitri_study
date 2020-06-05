package variable;

public class TypeChange {

	public static void main(String[] args) {
		
		int a = 10;
		int c = 20;
		double b = 20.2;
		double result = 0;
		//자동형변환
		result = a + b; // 4 byte + 8byte = 8byte
		System.out.println(result);
		
		result = a + c;
		System.out.println(result);
		//강제형변환
		result = (double)a + b; // 4byte + 8byte = 8byte
		System.out.println(result);
		
		int resultInt = (int)(a + b);   //int + double = int
		System.out.println(resultInt);
		

	}

}
