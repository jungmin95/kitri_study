package rep;

import java.util.ArrayList;

public class ServiceImpl implements Service {

	private Dao dao;
	
	public ServiceImpl(){
		dao = new DaoImpl();
	}
	
	public Article addArticle(Article a) {
		// TODO Auto-generated method stub
		int num = dao.insert(a);
		return dao.select(num);
	}

	public ArrayList<Article> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	public Article editArticle(Article a) {
		// TODO Auto-generated method stub
		int num = dao.update(a);
		return dao.select(num);
	}

	public int delArticle(int num) {
		// TODO Auto-generated method stub
		num = dao.delete(num);
		return num;
	}

	public Article getArticle(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

}
