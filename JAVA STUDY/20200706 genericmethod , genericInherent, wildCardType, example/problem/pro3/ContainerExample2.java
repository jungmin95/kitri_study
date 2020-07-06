package problem.pro3;


public class ContainerExample2 {
	public static void main(String[] args) {
		Container<String ,String> container1 = new Container<String, String>();
		container1.set("È«±æµ¿", "µµÀû");
		
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("È«±æµ¿", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}
class Container<T, J> {
	T key;
	J job;
	
	void set(T key, J job) {
		this.key = key;
		this.job = job;
	}
	T getKey() {
		return key;
	}
	J getValue() {
		return job;
	}
	
	
}