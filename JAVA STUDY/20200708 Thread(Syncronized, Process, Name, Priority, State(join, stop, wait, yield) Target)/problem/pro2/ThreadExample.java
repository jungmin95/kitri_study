package problem.pro2;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MovieThread();
		thread1.start();
		
//		Runnable r = new MusicRunnable();
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}

}
class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <3; i++) {
			System.out.println("동영상을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class MusicRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i <3; i++) {
			System.out.println("음악을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}