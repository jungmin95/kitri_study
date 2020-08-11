package service;

import java.util.ArrayList;

import model.Product;

public interface Service {

	void add(Product p);

	Product getProduct(int num);

	void editProduct(Product p);

	void delProduct(int num);

	void makeNum();

	ArrayList<Product> getProductAll();

	Product editQuantity(int q, int num);
}
