package computer;

public class Example {
	public static void main(String[] args) {
		Computer com = new Computer();
		Calculator cal = new Calculator();
		Jupan jupan = new Jupan();
		System.out.println(Calculator.PI);
		System.out.println(Computer.PI);
		
//		System.out.println(Jupan.PI);
		System.out.println(com.areaCircle(10));
		System.out.println(com.areaCircle(5));
		System.out.println(cal.areaCircle(10));
	}
}
