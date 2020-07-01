package shopping;

public class CustomerExample {

	public static void main(String[] args) {
		Customer rich = new Customer(30000);
		rich.buy(new Milk());
		rich.buy(new Fish());
		rich.buy(new Fish());
		rich.buy(new Fish());
		
		rich.checkMyMoney();
		

	}

}
