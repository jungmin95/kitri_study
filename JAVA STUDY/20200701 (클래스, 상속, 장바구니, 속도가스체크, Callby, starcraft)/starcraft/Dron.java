package starcraft;

public class Dron extends Worker {
	
	Dron() {
		super(40, 5);
	}

	
	@Override
	int mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
	
	boolean attack(Dron dron) {
		boolean result = false;
		dron.hp -= this.attackLevel;
		
		return result;
	}
	
	boolean attack(SCV scv) {
		boolean result = false;
		scv.hp -= this.attackLevel;
		
		return result;
	}
	
	boolean attack(Prove prove) {
		boolean result = false;
		prove.hp -= this.attackLevel;
		return result;
	}
}
