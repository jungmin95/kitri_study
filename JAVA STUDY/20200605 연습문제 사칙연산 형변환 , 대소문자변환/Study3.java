package variable;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.  
		 * 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오. 
		 * [Hint] 삼항 연산자를 두 번 사용하라
		 */
		
		int num = 10;
		String a = "양수";
		String b = "음수";
		String c = "0";
		String e = (num > 0)? a:
						(num < 0)? b:c;
		System.out.println(e);
	}

}
