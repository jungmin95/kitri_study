package starcraft;

public class Worker {
	Worker() {}
	
	Worker(int hp, int attackLevel) {
		this.hp = hp;
		this.attackLevel = attackLevel;
	}
	
	int hp = 0;
	int mp = 0;
	int attackLevel = 0;
	int depenceLevel = 0;
	
	int mine(int x, int y) {
		return 0;
	}
	
	boolean attack(Worker worker) {
		boolean result = false;
		worker.hp -= worker.attackLevel;
		
		return result;
		
	}
	
//	boolean attack(Dron dron) {
//		boolean result = false;
//		dron.hp -= this.attackLevel;
//		
//		return result;
//	}
//	
//	boolean attack(SCV scv) {
//		boolean result = false;
//		scv.hp -= this.attackLevel;
//		
//		return result;
//	}
//	
//	boolean attack(Prove prove) {
//		boolean result = false;
//		prove.hp -= this.attackLevel;
//		return result;
//	}
}
