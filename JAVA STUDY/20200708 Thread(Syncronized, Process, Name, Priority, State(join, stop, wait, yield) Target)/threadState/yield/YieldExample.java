package threadState.yield;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		ta.work = false;
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		ta.work = true;
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		ta.stop = true;
		tb.stop = true;
		
		
		
		System.out.println("프로그램 종료");
	}

}
class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadA 작업중");
				try {
					ThreadA.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
	
}

class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadB 작업중");
				try {
					ThreadB.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
	
}