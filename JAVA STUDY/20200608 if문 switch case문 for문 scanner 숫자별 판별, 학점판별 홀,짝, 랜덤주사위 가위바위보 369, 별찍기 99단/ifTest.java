package condition;

public class ifTest {

	public static void main(String[] args) {
		
		int x = 11;
		int y = 20;
		
		//조건문
		if (x!=y) {
			//실행문 == true
			System.out.println("x와 y가 다르다.");
			
			
		}// -> false
		
		//조건문
		if (x!=y) {
			//실행문 == true
			System.out.println("x와 y가 다르다.");
			
			
		}// -> false
		
		if (x%2 == 0) {
			System.out.println("짝수다");
		}
		else {
			System.out.println("홀수다");
		}
		
		if (x == 10 ) {
			System.out.println("x" + "는 10이다");
		} else if ( x == 11) {
			System.out.println("x" + "는 11이다");
		} else if ( x == 12) {
			System.out.println("x" + "는 12이다");
		} else {
			System.out.println("x" + "는 무엇인지 모른다");
		}
		


	}

}
