package servelettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test011
 */
//url ���� ��Ų�κ��̴�
//�̰Ÿ� �ּ�ó���ϸ� url ���� ��ü�� ���� �ʾƼ� ������ ������ ���
@WebServlet("/Test01") 
public class Test01 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test01() {
        super();
        // TODO Auto-generated constructor stub
    }


    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init() ����");
	} //���� ó�� ������ �� ����

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() ����");
	} //���� ���� �� ���� 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet() ����");//���ΰ�ħ �� ������ ���� ���� 
		
		response.setContentType("text/html; charset=UTF-8");//response ��ü�� �������� ����� �ؾ��Ѵ�.
		PrintWriter out = response.getWriter();//response ��ü���� out ��ü �ޱ� ..
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servelet Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Servelet Test01</h1>");
		out.println("Hi Servelet<br>");
		out.println("<body>");
		out.println("</body>");
		out.println("</html>");

	
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}