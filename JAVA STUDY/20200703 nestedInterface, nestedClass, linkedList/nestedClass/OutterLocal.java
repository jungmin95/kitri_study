package nestedClass;

public class OutterLocal {
	void methodLocal() {
		class Local {
			String localField = "localField";
			void methodLocal() {
				System.out.println("OutterLocal.methodLocal()." + "Local.methodLocal");
			}
		}
		Local local = new Local();
		local.methodLocal();
		System.out.println(local.localField);
	}

}
