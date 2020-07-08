package synchronizedExample;

public class MainThread {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cal);
		user2.start();
		
	}
}
class User1 extends Thread {
	private Calculator cal;
	
	User1() {
		this.setName("User1 : ");
	}

	public void setCalculator(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(1);
	}
	
}

class User2 extends Thread {
	private Calculator cal;
	
	User2() {
		this.setName("User2 : ");
	}

	public void setCalculator(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(2);
	}
	
}


class Calculator {
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ this.memory);
	}
}