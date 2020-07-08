package threadExample;

public class ThreadName {

	public static void main(String[] args) {
		Thread ta = new ThreadA("ta");
		ta.start();
//		ta.setName("ta");
		System.out.println(ta.getName());
		
		
		Thread tb = new ThreadA("tb");
		tb.start();
//		tb.setName("tb");
		System.out.println(tb.getName());

	}

}
class ThreadA extends Thread {
	ThreadA(String name) {
		
	}
	
	
	@Override
	public void run() {
		System.out.println("ThreadA ½ÇÇà");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}