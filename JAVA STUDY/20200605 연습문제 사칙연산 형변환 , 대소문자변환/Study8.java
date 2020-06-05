package variable;

public class Study8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b 의 값이 true가 되도록 하는 코드이다.
		 *  (1)에 알맞은 코드를 넣으시오. 
		 * 
		 */
		char ch = 'z';
		boolean b = (( ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z') );
		
		System.out.println(b);
		
	}

}
