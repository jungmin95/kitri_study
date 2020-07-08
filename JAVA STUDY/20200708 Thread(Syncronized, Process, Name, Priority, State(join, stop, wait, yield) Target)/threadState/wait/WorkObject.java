package threadState.wait;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA methodA()");
		notify();
		try {
			wait();
		} catch(Exception e) {
			
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB methodB()");
		notify();
		try {
			wait();
		} catch(Exception e) {
			
		}
	}
	
	public synchronized void methodC() {
		System.out.println("ThreadC methodC()");
		notify();
		try {
			wait();
		} catch(Exception e) {
			
		}
	}
}
