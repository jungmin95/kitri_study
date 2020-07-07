package kitristudy20200701;

public class Study2 {
	public static int abs(int value){

		value = value >= 0 ? value : -value;

		return value;

	}
	public static int max(int[] arr) {
		if( arr == null || arr.length == 0) 
			return -999999;
		int max = arr[0];
		for(int i = 1; i <arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
		
	}
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));
		
		
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 + " + abs(value));
		

	}

}
