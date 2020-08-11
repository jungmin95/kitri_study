package service;

import java.util.ArrayList;

import dao.Dao;
import dao.DaoImpl;
import model.Product;

public class ServiceImpl implements Service{

	private Dao dao;
	
	public ServiceImpl() {
		this.dao = new DaoImpl();
	}
	
	@Override
	public void add(Product p) {
		dao.insert(p);
		
	}

	@Override
	public Product getProduct(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	@Override
	public void editProduct(Product p) {
		dao.update(p);
		
	}

	@Override
	public void delProduct(int num) {
		dao.delete(num);
		
	}

	@Override
	public void makeNum() {
		
		
	}

	@Override
	public ArrayList<Product> getProductAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Product editQuantity(int q, int num) {
		// TODO Auto-generated method stub
		dao.updateQuantity(q, num);
		return getProduct(num);
	}

}
