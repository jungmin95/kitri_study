package threadState.wait;

public class ThreadA extends Thread {

	private WorkObject wo;
	
	ThreadA(WorkObject wo) {
		this.wo = wo;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			wo.methodA();
		}
	}
	
	

}
