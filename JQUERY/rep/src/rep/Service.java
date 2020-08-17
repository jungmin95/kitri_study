package rep;

import java.util.ArrayList;

public interface Service {
	Article addArticle(Article a);
	ArrayList<Article> getAll();
	Article editArticle(Article a);
	int delArticle(int num);
	Article getArticle(int num);
}
