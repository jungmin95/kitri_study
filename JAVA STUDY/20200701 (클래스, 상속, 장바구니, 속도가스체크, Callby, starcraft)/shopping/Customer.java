package shopping;

public class Customer {
	int myMoney = 0;
	int productCount = 0;
	int productPrice = 0;
	Product[] products = new Product[10];

	Customer(int money) {
		this.myMoney = money;
	}

	void buy(Product product) {
		if ((product.price <= myMoney) && (productCount < 9)) {
			for (int i = 0; i < products.length; i++) {
				if (products[i] == null) {
					products[i] = product;
					productCount++;
					productPrice += product.price;
					myMoney -= product.price;
					break;
				}
			}
		} else {
			System.out.println("No money!");
			System.out.println("No money!!");
		}
	}

	void addMoney(int money) {
		if (money > 0) {
			myMoney += money;
		} else {
			System.out.println("돈을 뺐지마세요");
		}
	}

	int countProducts() {
		System.out.println("products count : " + productCount);
		return productCount;
	}

	int priceProduct() {
		System.out.println("product Price : " + productPrice);
		return productPrice;
	}

	int checkMyMoney() {
		System.out.println("my Money : " + myMoney);
		return myMoney;
	}

	boolean pop(int index) {
		boolean result = false;
		if (products[index] != null) {
			myMoney += products[index].price;
			productCount--;
			productPrice -= products[index].price;
			products[index] = null;
			result = true;
		} else {
			System.out.println("선택한 장바구니 위치에 물건이 없습니다.");
		}

		return false;
	}
}
