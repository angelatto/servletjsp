<%--page 지시자   --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
<%--템플릿은 고정된 부분도 있고, 데이터가 binding되는 영역도 있다.  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	  <link rel="stylesheet" href="/servletjsp/common/bootstrap-4.6.0/css/bootstrap.min.css" >
      <script src="/servletjsp/common/jquery/jquery-3.5.1.min.js"></script>
      <script src="/servletjsp/common/bootstrap-4.6.0/js/bootstrap.bundle.min.js" ></script>
      <script src="/servletjsp/common/bootstrap-4.6.0/js/bootstrap.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

</head>
<body>
	<h5> view03.jsp</h5>
	<hr/>
	
	<table class="table">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>글쓴이</th>	
		</tr>
		
		<tr>
			<%--EL로 데이터 표현  --%>
			<td>${board.bno}</td>
			<td>${board.btitle}</td>
			<td>${board.bcontent}</td>
			<td>${board.bwriter}</td>	<%-- req에 저장해놓으면  EL로 getter 호출가능 --%>
		</tr>
		
		
	</table>
</body>
</html>