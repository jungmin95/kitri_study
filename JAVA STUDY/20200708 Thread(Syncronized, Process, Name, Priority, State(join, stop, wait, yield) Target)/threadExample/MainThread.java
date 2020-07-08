package threadExample;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while (true) {
//			System.out.println("Thread Ω««‡¡ﬂ");
//		}
		BeepThread bt = new BeepThread();
		bt.start();
		Runnable br = new BeepRunnable();
		Thread brThread = new Thread(br);
		brThread.start();
		
		System.out.println("main thread ¡æ∑·");
//		for (int i = 0; i < 10; i++) {
//			System.out.println("∂Ú∂Ú");
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				System.out.println("Thread.sleep() ø° ∑Ø");
//			}
//		}
	}

}

class BeepRunnable implements Runnable {
	@Override
	public void run() {
		// Ω««‡πÆ
		for (int i = 0; i < 10; i++) {
			System.out.println("∂Ú∂Ú");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Thread.sleep() ø° ∑Ø");
			}
		}
	}

}

class BeepThread extends Thread {
	@Override
	public void run() {
		// Ω««‡πÆ
		for (int i = 0; i < 10; i++) {
			System.out.println("∂Ø∂Ø");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Thread.sleep() ø° ∑Ø");
			}
		}
	}
}