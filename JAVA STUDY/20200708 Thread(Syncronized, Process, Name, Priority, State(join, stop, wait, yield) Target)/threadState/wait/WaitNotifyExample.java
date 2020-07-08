package threadState.wait;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject share = new WorkObject();
		
		ThreadA threadA = new ThreadA(share);
		ThreadB threadB = new ThreadB(share);
		ThreadC threadC = new ThreadC(share);
		threadA.start();
		threadB.start();
		threadC.start();
	}

}
