package nestedClass;

public class Outter {
	String outter = "Outter field";
	NestedClass nc = new NestedClass(); // 내부클래스이기때문에 내부에선 접근가능
	
	void method() {
		System.out.println("Outter method");
	}
	
	void runNestedClass() {
		nc.nestedMethod();
		System.out.println(nc.nested);
	}
	
	class NestedClass {
		NestedClass() {}
		String nested = "Nested field";
//		static int staticA = 10;
		void nestedMethod() {
			System.out.println("Nested method");
		}
//		static void nestedStaticMethod() {
//			System.out.println("NestedStaticMethod");
//		}
	}
}

class Outter2 {
	Outter out = new Outter();
	// NestedClass nc = new NestedClass(); 접근불가 (내부 클래스이기때문에 외부에서 접근x)
}