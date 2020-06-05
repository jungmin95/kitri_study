package variable;

public class Operator_Ex2 {
	public static void main(String[] args) {
		int a = 10;
		int b = -a;
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("a : " + a);
		
		//대입연산자 = += -= &= /= %= ^= >>=
		a = a + 10;
		System.out.println("a : " + a);
		a += 10;
		System.out.println("a : " + a);
		
		//증감연산자 ++ --
		a++;
		System.out.println("a++  : " + a);
		
		System.out.println(a++);
		System.out.println(++a);
		
		int x = 0;
		int y = 0;
		int z = x++ + ++x;
		System.out.println(x);
		System.out.println(z);
		
		x = 10;
		y = 10;
		
		z = ++x + ++y;
		System.out.println(z);
		
		
		x = 10;
		y = 10;
		System.out.println(x++ + ++y);
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
}
