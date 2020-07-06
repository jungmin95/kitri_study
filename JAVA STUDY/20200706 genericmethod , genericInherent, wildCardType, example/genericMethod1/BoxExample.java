package genericMethod1;

public class BoxExample {

	public static void main(String[] args) {
		Box box1 = new Box(10);
		Box2 box2 = new Box2(20);
		Box3 box3 = new Box3(30);
		
		Box boxstr1 = new Box("10");
		Box2 boxstr2 = new Box2("20");
		Box3 boxstr3 = new Box3("30");
		
//		Box boxbox1 = new Box(new Box(10));
		Box2<Box> boxbox2 = new Box2<Box>(new Box(20));
		Box3 boxbox3 = new Box3(new Box(30));
	}

}
