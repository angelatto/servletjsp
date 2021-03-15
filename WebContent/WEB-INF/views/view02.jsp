<%--page 지시자   --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<%--템플릿은 고정된 부분도 있고, 데이터가 binding되는 영역도 있다.  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5> view02.jsp</h5>
	
	<%--스크립트릿 Scriptlet
	:  자바코드가 들어간다.
	실행순서는 위에서 아래 방향이다.  --%>
	<%
		String name = "JSP 입니다. ";
	%>
	
	<%-- 표현식(Expressions)
	: 하나의 값만 출력하는 것만 가능하다.  --%>
	이름: <%=name %>
	
	<%--태그와 자바코드를 결합한 형태  --%>
	<% for(int i = 0; i < 6; i++){ %>
		<h <%=i %>> <%=name %> </h <%=i %>>
	<%}%>

</body>
</html>