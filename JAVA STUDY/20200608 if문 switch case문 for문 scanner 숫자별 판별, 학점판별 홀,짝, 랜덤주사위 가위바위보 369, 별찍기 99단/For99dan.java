package condition;

public class For99dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 2; i < 10; i++ ) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println( i +" * " + j + " = " + i*j );
//			}
//			System.out.println();
//		}
//		
//		//풀이
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.print(i + " * " + j + " = " + (i*j) + " \n");
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j < 10; j++) {
//				System.out.print(i + " * " + j + " = " + i*j + " ");
//				
//				
//			}
//			System.out.println();
//		}
		//사선제거
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if ((j - i) == 1) {
					System.out.print("\t\t");
				} else {
					System.out.print(i + " * " + j + " = " + i*j + "\t");
				}
				System.out.println();
				
			}
			
		}
		
	}	

}
