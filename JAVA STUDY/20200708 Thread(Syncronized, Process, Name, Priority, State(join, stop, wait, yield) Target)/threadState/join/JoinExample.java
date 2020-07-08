package threadState.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		try {
			sumthread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1~100гую╨ : " + sumthread.getSum());

	}

}

class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for (int i =1; i<=100; i++) {
			this.sum += i;
		}
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			
		}
	}
}
