package starcraft;

public class StartCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCV scv = new SCV();
		Prove prove = new Prove();
		Dron dron = new Dron();
		
		dron.attack(scv);
		System.out.println(scv.hp);
		System.out.println(dron.hp);
	}

}
