package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LiftCycleServlet
 */
@WebServlet("/LiftCycleServlet")
public class LiftCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LiftCycleServlet() {
    	
        super();
        System.out.println("객체생성");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init() call");
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		count++;
		out.print("<font size=7>count:"  + count + "</font> ");
		out.close();
	}
	@Override
	public void destroy() {
		System.out.println("****destroy 전 백업시작****");
		try {
			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("****destroy 전 백업종료****");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
