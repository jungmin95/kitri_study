package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiServlet
 */
@WebServlet("/MultiServlet")
public class MultiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		
		 
		out.println("성별 : " + gender);
		out.println("가수 : " + request.getParameter("singer"));
		System.out.println(request.getParameter("singer"));
		System.out.println(gender);
		String str1 = "";
		String name[] = request.getParameterValues("name");
		for(int i =0; i<name.length; i++) {
			str1 += name[i];
		}
		out.println("<img src = img/" + name + ".jpg");
		System.out.println(name);
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
