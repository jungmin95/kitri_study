package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductVO;
import service.EventService;

/**
 * Servlet implementation class control
 */
@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public control() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type=request.getParameter("type");
		String resultView="board/";
		EventService service = new EventService();
		if(type.equals("insert")) {
			String pname = request.getParameter("pname");
			String pmaker = request.getParameter("pmaker");
			String pprice = request.getParameter("pprice");
//			int pprice = Integer.parseInt(request.getParameter("pprice"));
			String pdetail = request.getParameter("pdetail");
			
			ProductVO vo = new ProductVO(0, pname, pmaker, pprice, pdetail);
			service.insert(vo);
			resultView += "index.jsp";
			
		}else if(type.equals("list")) {
			ArrayList<ProductVO> data = service.list();
			request.setAttribute("data", data);
			resultView +="list.jsp";
		}else if(type.equals("update")) {
			int sno = Integer.parseInt(request.getParameter("pno"));
			ProductVO m = service.getMember(sno);
			request.setAttribute("m", m);
			resultView += "update.jsp";
		}else if(type.equals("edit")) {
			int pno = Integer.parseInt(request.getParameter("pno"));
			String pname = request.getParameter("pname");
			String pmaker = request.getParameter("pmaker");
			String pprice = request.getParameter("pprice");
			String pdetail = request.getParameter("pdetail");
			ProductVO p = new ProductVO(pno, pname, pmaker, pprice, pdetail);
			service.edit(p);
			resultView += "index.jsp";
			
		}else if(type.equals("delete")) {
			int pno = Integer.parseInt(request.getParameter("pno"));
			service.delete(pno);
			resultView += "index.jsp";
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(resultView);
		dispatcher.forward(request, response);
	}

}
