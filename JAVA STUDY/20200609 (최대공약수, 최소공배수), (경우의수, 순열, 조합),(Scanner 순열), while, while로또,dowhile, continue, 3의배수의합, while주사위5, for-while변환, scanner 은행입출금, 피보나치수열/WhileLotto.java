package interation;

public class WhileLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = (int) (Math.random()*45) +1;
		int b = (int) (Math.random()*45) +1;
		int c = (int) (Math.random()*45) +1;
		int d = (int) (Math.random()*45) +1;
		int e = (int) (Math.random()*45) +1;
		int f = (int) (Math.random()*45) +1;
		int bonus = (int) (Math.random()*45) +1;
		
		
//		while
//			(a<6) {
//			while(b<6&&a!=b) {
//				while(c<6&&b!=c&&a!=c) {
//					System.out.println(a + ", " + b + ", " +c);
//					break;
//				}
//				break;
//			}
//			break;
//		}
//		while (a<6) {
//			if(a!=b&&a!=c&&b!=c) {
//				System.out.println(a + ", " + b + ", " +c);
//				break;
//			}
//		}
		while(true) {
			if((a != b) && (a!=c) && (a != d) && (a != e) && (a!= f) && (b!=c) && (b!=d) && (b!=e) && (b!=f)
					&&(c!=d) && (c!=e) && (c!=f) && (d!=e) && (d!=f) && (e!=f)
					&& (a != bonus) && (b != bonus) && (c != bonus) && (d != bonus) && (e != bonus) && (f != bonus)) {
			break;
			}
				a = (int) (Math.random()*45) +1;
				b = (int) (Math.random()*45) +1;
				c = (int) (Math.random()*45) +1;
				d = (int) (Math.random()*45) +1;
				e = (int) (Math.random()*45) +1;
				f = (int) (Math.random()*45) +1;
				bonus = (int) (Math.random()*45) +1;

		}
		System.out.println(a + ", " + b + ", " + c + ", " + d + ", " +e + ", " + f + " 보너스번호 : " + bonus);
	}

}
