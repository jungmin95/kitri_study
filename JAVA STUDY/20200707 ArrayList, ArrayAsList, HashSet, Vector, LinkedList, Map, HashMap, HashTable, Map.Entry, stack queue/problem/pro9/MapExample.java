package problem.pro9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		System.out.println(map.size());
//		Set<String> keyset = map.keySet();
//		Iterator<String> key = keyset.iterator();
		
//		while(key.hasNext()) {
//			String tempKey = key.next();
//			Integer tempValue = map.get(tempKey);
//			if() {
//				System.out.println("최고점수 : " +tempValue);
//				System.out.println("최고점수를 받은 아이디 : " +tempKey);
//			}
//		}
		
		Set<String> setkey = map.keySet();
		Iterator<String> it = setkey.iterator();
		
		int[] arr = new int[map.size()];
		int i = 0;
		while (it.hasNext()) {
			String key = it.next();
			arr[i] = map.get(key);
			
			if(arr[i] > maxScore) {
				maxScore = arr[i];
				name = key;
			} else {
				System.out.println("maxScore : " + maxScore);
				System.out.println("name : " + name);
			}
		}
		
		
//		Arrays.sort(arr);
//		for(int temp : arr) {
//			System.out.println(temp);
//		}
//		maxScore = arr[arr.length -1];
//		Set<Map.Entry<String, Integer>> set = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> itMap = set.iterator();
//		
//		while(itMap.hasNext()) {
//			Map.Entry<String, Integer> tMap = itMap.next();
//			tMap.getValue();
//			tMap.getKey();
//		}

		
		

	}
}
