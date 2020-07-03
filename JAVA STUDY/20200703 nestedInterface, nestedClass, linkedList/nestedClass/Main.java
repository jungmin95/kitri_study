package nestedClass;

public class Main {
	public static void main(String[] args) {

		A a = new A(); //일반

		A.B b = a.new B(); //내부 인스턴스클래스

		A.C c = new A.C(); //내부 스태틱멤버

		a.method(); //로컬멤버
	}
}
