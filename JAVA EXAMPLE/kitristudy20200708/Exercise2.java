package kitristudy20200708;

public class Exercise2 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.println(i.iv);

	}

}
class Outer {
	class Inner {
		int iv=100;
	}
}