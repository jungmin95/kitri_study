package problem.pro4;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("È«±æµ¿", 35);
		Integer age = Util.getValue(pair, "È«±æµ¿");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("È«»ï¼ø", 29);
		Integer childAge = Util.getValue(childPair, "È«»ï¼ø");
		System.out.println(childAge);
		
		OtherPair<String, Integer> otherPair = new OtherPair<>("È«»ï¿ø", 20);
		int otherAge = Util.getValue(otherPair, "È«»ï¿ø");
		System.out.println(otherAge);
		
	}
}
class Util {
	public static <P extends Pair, K, I> I getValue(P p , K key) {
		I result;
		if(key == p.getKey()) {
			result = (I) p.getValue();
		} else {
			result = null;
		}
		return result;
	}
	
}
class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
}
class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}
class OtherPair<K, V> {
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key; }
	public V getValue() { return value; }
}