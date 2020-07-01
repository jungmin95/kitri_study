package terms;

public class CallBy {

	public static void main(String[] args) {
		Call call = new Call(20);
		
		callValue(10);
		callRef(call);

	}
	//CallByValue
	static void callValue(int a) {
		System.out.println(a);
	}
	//CallByReference
	static void callRef(Call call) {
		System.out.println(call.a);
	}
}

class Call {
	int a;
	Call(int a) {
		this.a = a;
	}
}