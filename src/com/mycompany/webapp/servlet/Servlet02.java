package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Servlet02 - service() 실행 ");
		
		// 요청 내용을 확인
		System.out.println("클라이언트 IP: " + req.getRemoteHost()); // 누가 나한테 요청했는지 
		
		// 요청 처리
		
		
		// [방법 1] 응답 내용을 생성 및 전송 
//		res.setContentType("text/html; charset:UTF-8");
//		PrintWriter writer = res.getWriter();
//		writer.println("<html>");
//		writer.println("<head></head>");
//		writer.println("<body>Servlet01<hr/></body>");
//		writer.println("</html>");
//		writer.flush();
//		writer.close();
		
//		 [방법 2] 응답 내용을 생성 및 전송 - 응답 내용을 jsp로 작성 
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view02.jsp");
		rd.forward(req, res);
		
		// Servlet에서 응답을 생성하는 것이 아니라, jsp에서 응답내용을 만들어내서 전송하겠다. 
		
	}
}
