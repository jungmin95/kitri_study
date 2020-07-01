package polymorphism;

public class ExampleA {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		E e = new E();
		

		a2 = new C();
		a3 = new D();
		a4 = new E();
		a5 = new E();
		
		//강제 다형성 == 형변환
		if (e instanceof A) {
		e = (E)new A();
		}
		if (e instanceof C) {
		e = (E)new C();
		}


	}

}
