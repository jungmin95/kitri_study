package problem;

public class SuperCar extends Car {
	private static SuperCar s = new SuperCar();
	
	private SuperCar() { }
	
	static SuperCar getInstance() {
		return s;
	}
	@Override
	void run() {
		if (powerCheck()) {
			if (getSpeed() <= (MAX_SPEED - 50) && (getGas() >= 5)) {
				setSpeed(getSpeed() + 50);
				setGas(getGas() - 5);
			} else if (getSpeed() < (MAX_SPEED) && (getGas() >= 5)) {
				setSpeed(MAX_SPEED);
				setGas(getGas() - 5);
			} else {
				System.out.println("속도를 올릴 수 없습니다.");
			}
		}
	}
	
	void buster() {
		if(powerCheck()) {
			if(getGas() >= 20) {
				setSpeed(MAX_SPEED);
			}
		}
	}
}
