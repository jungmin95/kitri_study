package interation;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0    1    1     2   3    5    8    13
		//f(0) f(1) f(2) f(3) f(4) f(5) f(6) f(7)
//		f(7) = f(6) + f(5) = f(4) + f(3)
		
		System.out.println(fibo(6));
	}
	
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
		return fibo(n-1) + fibo(n-2);
		}
	}

}
