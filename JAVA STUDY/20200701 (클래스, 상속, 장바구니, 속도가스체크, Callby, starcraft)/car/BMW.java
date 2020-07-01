package car;

public class BMW extends Car {
	BMW() {
		super("str");
		System.out.println("BMW() 생성자");
	}
	String engine = "부르르르르르릉";
	public static void main(String[] args) {

		BMW bmw = new BMW();
		System.out.println(bmw.engine);
		bmw.run();
	}
}
