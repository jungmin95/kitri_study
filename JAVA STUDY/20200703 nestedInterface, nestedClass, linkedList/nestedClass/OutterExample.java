package nestedClass;

public class OutterExample{

	public static void main(String[] args) {
		Outter out = new Outter();
		out.runNestedClass();
		
		Outter.NestedClass nested = out.new NestedClass();
		nested.nestedMethod();
		System.out.println(nested.nested);

	}

}
