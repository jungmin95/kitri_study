package threadState.wait;

public class ThreadB extends Thread{
	
	private WorkObject wo;
	
	ThreadB(WorkObject wo) {
		this.wo = wo;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			wo.methodB();
		}
	}
}
