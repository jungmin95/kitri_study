package variable;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다음 아래 코드를 작성하고 결과를 출력하시오.
		 */
		int x = 2;
		int y = 5;
		
		char c = 'A'; //A의 문자코드 65
		System.out.println(1 + x << 33); 
		System.out.println(y >= 5 || x < 0 && x > 2); 
		System.out.println(y += 10 - x++); 
		System.out.println(x+=2); 
		System.out.println( !('A' <= c && c <='Z') ); 
		System.out.println('C'-c); 
		System.out.println('5'-'0'); 
		System.out.println(c+1); 
		System.out.println(++c); 
		System.out.println(c++); 
		System.out.println(c);
	}

}
