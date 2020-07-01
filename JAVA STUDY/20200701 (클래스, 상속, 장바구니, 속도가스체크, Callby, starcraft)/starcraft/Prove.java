package starcraft;

public class Prove extends Worker{
	Prove() {
		super.hp = 40;
		super.attackLevel = 5;
	}
	
	@Override
	int mine(int x, int y) {
		System.out.println("x : " + x + ", y : " + y);
		return 0;
	}
}
