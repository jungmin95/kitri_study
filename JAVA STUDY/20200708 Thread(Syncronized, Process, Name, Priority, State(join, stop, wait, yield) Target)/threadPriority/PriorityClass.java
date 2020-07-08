package threadPriority;

public class PriorityClass {

	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		int priority = 10;
		for(int i = 0; i<10; i++) {
			Thread thread = new CalcThread("Calc - " + i);
			thread.setPriority(priority - 1);
			thread.start();
		}
		
		for (int k = 2; k<10; k++) {
			for(int j = 1; j<10; j++) {
				System.out.println(k + "*" + j + "=" + k*j);
			}
		}
		

	}

}
class CalcThread extends Thread {
	CalcThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 200000000; i++) {
			
		}
		System.out.println(getName());
	}
}