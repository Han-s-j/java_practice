<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdbc.UserService" %>
<%@ page import="jdbc.UserVO" %>
<jsp:useBean id="user" class="jdbc.UserVO" scope="page" />
<jsp:setProperty property="userId" name="user" />
<jsp:setProperty property="userNm" name="user" />
<!--  수정 -->
<%
	System.out.println(user);
	UserService service = UserService.getInstance();
	service.updateUser(user);
	response.sendRedirect("mypage.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>