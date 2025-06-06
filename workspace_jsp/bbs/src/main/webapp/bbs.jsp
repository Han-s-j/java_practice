<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jdbc.UserService" %>
<%@ page import="jdbc.BbsVO" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	UserService service = UserService.getInstance();
	ArrayList<BbsVO> arr = service.bbsList();
	System.out.println(arr);
	// 해당 jsp page 어디에서든 arr 이름으로 사용가능
	pageContext.setAttribute("arr",arr);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/inc/top.jsp"></jsp:include>
	<script src="//cdnjs.cloudflare.com/ajax/libs/list.js/2.3.1/list.min.js"></script>
	<script>
		$(document).ready(function(){
			let options = {
					valueName :["discussionId", "title", "writerId", "readCount"]
					,page:5
					,pagination : true
			};
			let bbsList = new List("bbs", options);
		});
	</script>
	  
	<!-- content 영역 -->
	<main class="container-fluid p-3">
		<div class="row d-flex align-items-center"  style="height: 600px;">
			<div class="col-lg-1"></div>
			<div class="col-lg-10" id="bbs">
				<div class="input-group">
					<input type="text" class="search form-control" placeholder="search">
					<button class="sort btn btn-dark input-group-text" date-sort="readCount">정렬</button>
				</div>
				<table class="table table-striped" style="text-align:center;" >
					<thead>
						<tr>
						   <th style="background-color: #eeeeee; text-align:center">번호</th>
						   <th style="background-color: #eeeeee; text-align:center">제목</th>
						   <th style="background-color: #eeeeee; text-align:center">작성자</th>
						   <th style="background-color: #eeeeee; text-align:center">작성일</th>
						</tr>
					</thead>
					<tbody class="list">
					 	<!-- items=배열, var=item 배열의 각 요소가 item에 담김 -->
						<c:forEach var="item" items="${arr}">
							<tr>
								<td class="discussionId">${item.discussionId}</td>
								<td class="title">${item.title}</td>
								<td class="writerId">${item.writerId}</td>
								<td class="readCount">${item.readCount}</td>
							</tr>
						
						</c:forEach>
					</tbody>
				</table>
				<div class="d-flex justify-content-center">
					<ul class="pagination"></ul>
				</div>
				<div class="d-grid gap-2 d-md-flex justify-content-md-end">
					<a href="write.jsp" class="btn btn-dark pull-right" role="button" >글쓰기</a>
				</div>
			</div>
			<div class="col-lg-1">
			</div>
		</div>
	</main>
    <!-- content 영역 끝 -->
	<jsp:include page="/WEB-INF/inc/footer.jsp"></jsp:include>
</body>
</html>