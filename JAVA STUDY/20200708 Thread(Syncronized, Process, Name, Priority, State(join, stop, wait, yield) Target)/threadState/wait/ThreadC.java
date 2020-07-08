package threadState.wait;

public class ThreadC extends Thread{
	private WorkObject wo;
	
	ThreadC(WorkObject wo) {
		this.wo = wo;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			wo.methodC();
		}
	}
}
