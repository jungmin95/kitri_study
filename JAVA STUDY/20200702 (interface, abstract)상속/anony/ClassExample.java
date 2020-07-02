package anony;

public class ClassExample {
	public static void main(String[] args) {
		IA ia = new IA(){
			public void print() {
				System.out.println("익명객체 사용");
			}
		};
		ia.print();
		
	}
}
