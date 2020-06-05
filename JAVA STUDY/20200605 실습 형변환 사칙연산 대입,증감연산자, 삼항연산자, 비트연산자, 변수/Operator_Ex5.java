package variable;

public class Operator_Ex5 {
	public static void main(String[] args) {
		// 비트연산자 and(&) or(|) nor(^)  not(~)
//		3 => 0011b
//		2 => &0010b
//		  => 0010b
		byte a = 3;
		byte b = 2;
		byte c = (byte) (a & b); //2
		System.out.println(c);
		
		byte d = (byte) (a | b);
		System.out.println(d);
		
		byte e = (byte) (a ^ b);
		System.out.println(e);

		// 3 => 0011b
		//      0110b => 6
		//      1100b => 12
		
		byte f = (byte) (a<<1);
		System.out.println(f);
		
		f = (byte)(a<<2);
		System.out.println(f);
		
		
		// 12 => 1100b  >> 
		//       0110b  => 6  >>
		//		 0011   => 3  
		// -9 1111 1000b >> 1
		// -4 1111 1100b
		
		byte g = (byte)(-8 >> 1);
		System.out.println(g);
		
//		byte f = (byte) (a ~ b);
//		System.out.println(f);
		
		
		
	}
}
