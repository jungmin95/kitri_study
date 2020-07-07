package list;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		
		for(String str : stooges) {
//			System.out.println(str);
		}
		print(1,2,3,4,5,6,7);
		
	}
	
	public static void print(int ... a ) {
		for (int in : a) {
			System.out.println(in);
		}
	}

}
