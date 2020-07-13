package kitristudy20200714_2;

public class MyRunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRun mr1 = new MyRun();
		Thread t1 = new Thread(mr1);
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
		for (int i=0; i<100; i++) {
			System.out.println("M");
		}
	}

}
