package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet03 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Servlet03 - service() 실행 ");
		
		// 요청 내용을 확인
		System.out.println("클라이언트 IP: " + req.getRemoteHost()); // 누가 나한테 요청했는지 
		
		// data 생성 및 JSP 전달 
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("제목1");
		board.setBcontent("내용1");
		board.setBwriter("spring");
		req.setAttribute("board", board);
		
		
//		 [방법 2] 응답 내용을 생성 및 전송 - 응답 내용을 jsp로 작성 
// 		Servlet에서 응답을 생성하는 것이 아니라, jsp에서 응답내용을 만들어내서 전송하겠다.
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view03.jsp");
		rd.forward(req, res);
		
		 
		
	}
}
