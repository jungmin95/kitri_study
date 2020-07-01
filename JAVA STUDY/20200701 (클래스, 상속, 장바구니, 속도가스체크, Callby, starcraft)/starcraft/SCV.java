package starcraft;

public class SCV extends Worker{
	SCV() {
		super.hp = 50;
		super.attackLevel = 5;
	}
	
	@Override
	int mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
}
