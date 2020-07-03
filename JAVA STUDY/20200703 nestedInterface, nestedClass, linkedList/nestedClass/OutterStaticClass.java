package nestedClass;

public class OutterStaticClass {
	static class StaticClass {
		String Nested = "hi";
		static String staticNested = "Hello";

		void methodSC() {
			System.out.println("StaticClass.methodSC()");
		}

		static void methodStaticSC() {
			System.out.println("StaticClass.methodStaticSC()");

		}
	}
}
