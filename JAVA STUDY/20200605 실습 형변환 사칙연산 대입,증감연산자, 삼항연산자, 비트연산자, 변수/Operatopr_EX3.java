package variable;

public class Operatopr_EX3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean bool = true;   // false;
		
		bool = (a < b);
		System.out.println(bool);
		// > < >= <= == !=
		bool = (a == b);
		System.out.println(bool);
		
		bool = (a != b);
		System.out.println(bool);
		
		//논리연산자 AND (& &&) , or (| ||), not(!)
		bool = (a != b) && (a != 0); //true, true
		System.out.println(bool);
		
		boolean b1 = (a>b)||(a<b); //false || true => true
		boolean b2 = (a<=b)&&(a!=b); //true&&true => true
		boolean b3 = (a>0)|(a!=b); // true | true => true
		boolean b4 = (a==b)&&(a!=b); // false && true => false
		boolean b5 = !(a<=b); // !true => false
		System.out.println("===========");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
