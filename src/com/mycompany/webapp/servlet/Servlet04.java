package com.mycompany.webapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet04 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Servlet04 - service() 실행 ");
		
		// 요청 내용을 확인
		System.out.println("클라이언트 IP: " + request.getRemoteHost()); // 누가 나한테 요청했는지 
		
		// data 생성 및 JSP 전달 
		List<Board> list = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목" + i);
			board.setBcontent("내용" + i);
			board.setBwriter("spring");
			list.add(board);
		}
		
		request.setAttribute("list", list);
		
//		 [방법 2] 응답 내용을 생성 및 전송 - 응답 내용을 jsp로 작성 
// 		Servlet에서 응답을 생성하는 것이 아니라, jsp에서 응답내용을 만들어내서 전송하겠다.
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/view04.jsp");
		rd.forward(request, response);
		
		 
		
	}
}
