package variable;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.  
		 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		 * 13개의 바구 니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		 */
		int numberOfApple = 123;
		int sizeOfBucket = 10;
		int numberOfBucket = ((numberOfApple / sizeOfBucket) +1);
		System.out.println("필요한 바구니의 수 : " + numberOfBucket);
		
	}

}
