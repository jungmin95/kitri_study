package nestedClass;

public class A {
	A() {
	}
	//중첩 인터페이스
	interface IB {
		static final double PI = 3.14;
		public abstract void method();
	}
	// 인스턴스 멤버 클래스 : 인스턴스는 스태틱클래스 x
	class B {
		int field;

		// static int staticfield;
		void method() {
		}
		// static void methodStatic() { }
	}

	static class C {
		int field;
		static int staticfield;

		void method() {
		}

		static void methodStatic() {
		}
	}

	void method() {
		class D {
			int field;

			//static int staticfield;
			void method() {}
			// static void methodStatic() { }
		}
		D d = new D();
		d.field =3;
		d.method();
	}
}
