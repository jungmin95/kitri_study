package InterfaceExtends;

public class Goliath implements GtoAll{

	@Override
	public void attackGround() {
		System.out.println("attackGround()");
		
	}

	@Override
	public void attackAir() {
		System.out.println("attackAir()");
		
	}

	@Override
	public void upgrade() {
		System.out.println("upgrade()");
		
	}
	
	public static void main(String[] args) {
		Goliath g = new Goliath();
		g.attackAir();
		g.attackGround();
		g.upgrade();
	}

}
