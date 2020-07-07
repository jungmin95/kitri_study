package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("IBATIS");
		
		int size = list.size();
				System.out.println("size : "  + size);
		
//		for (int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			System.out.println(i + ":" + str);
//	
//		}
		
		list.remove(2);
		list.remove("JDBC");
		
		for (int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
	
		}
	}
}
