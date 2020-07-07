package list;

import java.util.List;
import java.util.Vector;

public class VentorExample {
	
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add(2, "Database");
		
		for(String str : list) {
			System.out.print(str + ", ");
		}
		
		list.remove(2);
		
		for(String str : list) {
			System.out.print(str + ", ");
		}
	}
}
