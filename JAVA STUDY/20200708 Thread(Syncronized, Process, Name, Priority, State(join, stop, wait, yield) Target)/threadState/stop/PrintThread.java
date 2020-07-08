package threadState.stop;

public class PrintThread extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("printThread µø¿€¡ﬂ");

				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
