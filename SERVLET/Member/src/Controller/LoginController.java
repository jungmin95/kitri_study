package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Member;
import service.JoinService;
import service.JoinServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		response.setCharacterEncoding("euc-kr");
		
		//����� ������ ���񽺰�ü ���ּ�
		JoinService service = new JoinServiceImpl();
		
		boolean flag = false;
		
		//���� ����
		HttpSession session = request.getSession();
		
		//��û �Ķ���� �б�
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		Member m = service.getMember(id);
		
		if(m != null && pwd.equals(m.getPwd())) {
			//�α��� ������ id�����ǿ� ����
			session.setAttribute("id", id);
			
			//�α��� ���� ���θ� flag�� ����
			flag = true;
		}
		//���ǿ� �α��� �������θ� ����
		session.setAttribute("flag", flag);
		
		//�޴� �������� �̴��Ǥ�
		RequestDispatcher dispatcher = request.getRequestDispatcher("//member/result.jsp");
		if(dispatcher != null) {
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}