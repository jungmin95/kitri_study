package polymorphism;

public class Example {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Child3 child3 = new Child3();
		
		parent = child1;
		
		
		parent.method();

		child1.method();
		child2.method();
		child3.method();
		
	}
}
