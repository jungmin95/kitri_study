package rep;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		String result = "";
		Article a = null;
		ArrayList<Article> data = null;
		int num = 0;
		Service service = new ServiceImpl();
		if (type.equals("addArticle")) {
			a = new Article();
			a.setName(request.getParameter("name"));
			a.setContent(request.getParameter("content"));
			a = service.addArticle(a);
			request.setAttribute("a", a);
			result = "article.jsp";
		} else if (type.equals("articleList")) {
			data = service.getAll();
			request.setAttribute("data", data);
			result = "articleList.jsp";
		} else if (type.equals("editForm")) {
			num = Integer.parseInt(request.getParameter("num"));
			a = service.getArticle(num);
			request.setAttribute("a", a);
			result = "article.jsp";
		} else if (type.equals("edit")) {
			a = new Article();
			a.setNum(Integer.parseInt(request.getParameter("num")));
			a.setName(request.getParameter("name"));
			a.setContent(request.getParameter("content"));			
			a = service.editArticle(a);
			request.setAttribute("a", a);
			result = "article.jsp";
		} else if (type.equals("del")) {
			num = Integer.parseInt(request.getParameter("num"));
			num = service.delArticle(num);
			request.setAttribute("num", num);
			result = "del.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(result);
		dispatcher.forward(request, response);
	}

}
