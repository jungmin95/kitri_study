package kitristudy20200708;

public class FlyerMain {

	public static void main(String[] args) {
		System.out.println(Flyer.fast);
		
		Bird b = new Bird();
		FlyerUtil.show(b);
		
		Airplane ap = new Airplane();
		ap.fly();
		FlyerUtil.show(ap);
		
		Flyer f = new Bird();
		f.fly();
		System.out.println(f.isAnimal());
		FlyerUtil.show(f);
		
		Bird bf = (Bird)f;
		FlyerUtil.show(bf);
	}

}
interface Flyer {
	int fast = 100;
	void fly();
	boolean isAnimal();
}

class Bird implements Flyer {
	public void fly() {
		System.out.println("Bird flying");
	}

	@Override
	public boolean isAnimal() {
		// TODO Auto-generated method stub
		return true;
	}
}
class Airplane implements Flyer {
	public void fly() {
		System.out.println("Airplane flying");
	}

	public boolean isAnimal() {
		
		return false;
	}
}
class FlyerUtil {
	public static void show(Flyer f ) {
		f.fly();
		System.out.println(f.isAnimal());
	}
}