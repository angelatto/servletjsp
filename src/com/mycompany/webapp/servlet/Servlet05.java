package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Controller05;

public class Servlet05 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Servlet05 - service() 실행 ");
		
		// 컨트롤러 생성 및 요청 처리 메소드 호출 
		Controller05 ctr = new Controller05();
		String viewName = ctr.getBoardList(request, response);
		
		
//		 [방법 2] 응답 내용을 생성 및 전송 - 응답 내용을 jsp로 작성 
// 		Servlet에서 응답을 생성하는 것이 아니라, jsp에서 응답내용을 만들어내서 전송하겠다.
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		
		// 컨트롤러에게 뷰 이름 선택 권한을 넘겨주었다. 
		RequestDispatcher rd = request.getRequestDispatcher(prefix + viewName + suffix);
		rd.forward(request, response);
		
		 
		
	}
}
