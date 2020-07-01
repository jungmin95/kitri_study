package problem;

public class Car {
	static final int MAX_SPEED = 300;
	static final int MAX_GAS = 40;
	private int speed = 0;
	private int gas = 0;
	private boolean power = false;

	boolean powerCheck() {
		return power;
	}
	int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	int getSpeed() {
		return speed;
	}
	
	
	
	void powerChange() {
		power = !power;
		if (power) {
			System.out.println("PowerOn");
		} else {
			System.out.println("PowerOff");
		}
	}

	boolean insertGas(int gas) {
		boolean result = false;
		if (gas > 0) {
			int tempGas = this.gas + gas;
			if (tempGas <= MAX_GAS) {
				this.gas = tempGas;
				result = true;

			} else {
				System.out.println("gas 입력량이 초과");
			}
		} else {
			System.out.println("gas입력량이 0보다 작습니다");
		}
		return result;
	}

	void run() {
		if (power) {
			if (speed <= (MAX_SPEED - 50) && (gas >= 5)) {
				this.speed += 50;
				this.gas -= 5;
			} else if (speed < (MAX_SPEED) && (gas >= 5)) {
				this.speed = MAX_SPEED;
				this.gas -= 5;
			} else {
				System.out.println("속도를 올릴 수 없습니다.");
			}
		}
	}

	void stop() {
		if (speed > 100) {
			speed -= 100;
		} else if (speed <= 100) {
			speed = 0;
		}
	}

	void printCarChheck() {
		System.out.println("max_speed : " + MAX_SPEED);
		System.out.println("max_gas :" + MAX_GAS);
		System.out.println("speed : " + speed);
		System.out.println("gas : " + gas);
		System.out.println("power : " + power);

	}
}
