<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="jdbc.UserService" %>
 <%@ page import="jdbc.UserVO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	String userId =null;
	if(session.getAttribute("userId") != null){
		userId = (String)session.getAttribute("userId");
	}else{
		// redirect 클라이언트에게 다른 페이지를 요청하도록
		response.sendRedirect("login.jsp");
	}
	// userId가 있을경우
	UserService service = UserService.getInstance();
	// 상세정보 조회
	UserVO vo = service.userInfo(userId);
	pageContext.setAttribute("user", vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage</title>
</head>

<body>
	<jsp:include page="/WEB-INF/inc/top.jsp"></jsp:include>
    	<!-- content 영역 -->
		<div class="container-fluid">
      <div class="row align-items-center" style="height:700px">
        <div class="col-lg-4"></div>
        <div class="col-lg-4">
          <form action="mypageAction.jsp" method="post" class="needs-validation" novalidate>
            <h3	style="text-align: center; padding-bottom: 5%; padding-top: 15%;">마이페이지</h3>
            <div class="form-group">
              <input type="text" class="form-control" disabled value="${user.userId}" maxlength="20" >
              <input type="hidden" name="userId" value="${user.userId}">
              </div>
            <div class="form-group pt-1" >
              <input type="password" class="form-control" disabled value="${user.userPw}" maxlength="20">
            </div>
             <div class="form-group pt-1" style="padding-bottom: 5%;">
              <input type="text" class="form-control" value="${user.userNm}" name="userNm" required>
            </div>
            <input type="submit" class="btn btn-success form-control" value="수정">
          </form>
        </div>
        <div class="col-lg-4">
        </div>
      </div>
    </div>
    <!-- content 영역 끝 -->

	<jsp:include page="/WEB-INF/inc/footer.jsp"></jsp:include>
</body>
</html>