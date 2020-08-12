package rep.service;

import java.util.ArrayList;

import rep.dao.Dao;
import rep.dao.DaoImpl;
import model.Rep;

public class ServiceImpl implements Service{

	private Dao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}
	
	@Override
	public void addRep(Rep rep) {
		
		dao.insert(rep);
	}

	@Override
	public ArrayList<Rep> getRepsByImg_num(int img_num) {
		// TODO Auto-generated method stub
		return dao.selectByImg_num(img_num);
	}

}
