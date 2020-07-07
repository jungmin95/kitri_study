package set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Spring");
		
		int size = set.size();
		System.out.println(size);
		
		set.add("JDBC");
		
		size = set.size();
		System.out.println(size);
		
		set.clear();
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		
		if(set.isEmpty()) {
			System.out.println("비어있다");
		}
	}

}
