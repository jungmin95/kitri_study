package InterfacePackage;

interface InterfaceA {
	//상수, 추상메소드
	static final double PI = 3.14;
	public abstract void sayHello();
	public default void sayGoodBye() {
		System.out.println("GoodBye");
	}
	public static void saySeeYou() {
		System.out.println("See you");
	}
	
	
}

interface InterfaceB {
	public abstract void sayHi();
}

public class InterfaceExample implements InterfaceA, InterfaceB{
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	@Override
	public void sayHi() {
		System.out.println("Hi");
	}
}
