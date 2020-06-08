package condition;

public class ifTestEx {

	public static void main(String[] args) {
		int student = 41;
		if(student >= 90) {
			System.out.println("A");
		}
		else if (student >= 80 && student <= 90) {
			System.out.println("B");
		}
		else if (student >= 70 && student <= 80) {
			System.out.println("C");
			
		}
		else if (student >= 60 && student <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
