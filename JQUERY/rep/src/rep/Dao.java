package rep;

import java.util.ArrayList;

public interface Dao {
	int insert(Article a);
	Article select(int num);
	ArrayList<Article> selectAll();
	int update(Article a);
	int delete(int num);
}
