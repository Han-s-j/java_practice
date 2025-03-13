<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 주석 ctrl + shift + c -->
<!-- 디렉티브 page -->
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언부  -->
	<%!
		public int multiply(int x, int y){
			return x * y;
		}
	%>
	<!-- 선언부  -->
	<!-- 스크립트릿:자바코드 블럭 -->
	<%
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = format.format(today);
		int result = multiply(2, 10);
	%>
	<h1> Hello ^^ </h1>
	<!-- 표현식 -->
	<h1> 오늘은: <%=dateStr %></h1>
	<h1> 결과 2*10 : <%=result %></h1>
</body>
</html>