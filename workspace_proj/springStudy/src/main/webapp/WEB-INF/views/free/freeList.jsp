<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<body>
	<jsp:include page="/WEB-INF/inc/top.jsp" ></jsp:include>
	<!-- 파라미터로 넘어온 searchVO+totalRowCount,pageSetting()이 된 searchVO -->
	<section class="page-section" id="contact">
		<div class="container" style="margin-top: 100px;">
			<div class="card-body pt-0">
				<!-- data-list 내 valueNames 의 배열 내부 요소들에 대한 검색이 이루어진다 -->
				<!-- START : 검색 폼  -->
				<div class="row g-0 justify-content-md-center">
					<div class="col-auto col-sm-5 mb-3">
						<form name="search" action="freeList" method="post">
							<input type="hidden" name="curPage" value="">
							<input type="hidden" name="rowSizePerPage" value="">
							<div class="input-group">
								<div class="col-sm-2">
									<select id="id_searchType" name="searchType"
										class="form-control input-sm">
										<option value="T" >제목</option>
										<option value="W" >작성자</option>
										<option value="C" >내용</option>
									</select>
								</div>
								<div class="col-sm-2">
									<select id="id_searchCategory" name="searchCategory" class="form-control input-sm">
										<option value="">-- 전체 --</option>
										<c:forEach items="${comList}" var="code">
											<option value="${code.commCd}">${code.commNm}</option>
										</c:forEach>
									</select>
								</div>
								<div class="col-sm-6">
									<!-- 검색바 -->
									<input class="form-control shadow-none search" name="searchWord" type="search" placeholder="검색어" aria-label="search" value="" />
								</div>
								<div class="col-sm-2 text-right">
									<button type="submit" class="btn btn-primary form-control">
										<i class="fa fa-search"></i> &nbsp;&nbsp;검 색</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- END : 검색 폼  -->
				<!-- START : 목록건수 및 새글쓰기 버튼  -->
				<div class="row justify-content-md-end">
					<div class="col-sm-2">
						<div class="input-group">
							<label class="form-control input-sm">총 0 건</label>
							<select id="id_rowSizePerPage"	name="rowSizePerPage" class="form-control">
							</select>
						</div>	
					</div>
				</div>
				<!-- END : 목록건수 및 새글쓰기 버튼  -->
			</div>
			<table class="table table-striped table-bordered table-hover">
				<colgroup>
					<col width="10%" /><col width="15%" /><col /><col width="10%" /><col width="15%" /><col width="10%" />
				</colgroup>
				<thead>
					<tr>
						<th>글번호</th><th>분류</th><th>제목</th><th>작성자</th><th>등록일</th><th>조회수</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<a href="freeForm" class="btn btn-primary">글쓰기</a>
			</div>
			<!-- START : 페이지네이션  -->
			<nav aria-label="Page navigation example">
				<ul class="pagination justify-content-center">
					<!-- 이전 페이지 -->
						<li class="page-item">
							<a class="page-link" href="#"
							 data-page="" aria-label="Previous"> 
								<span aria-hidden="true">&laquo;</span>
							</a>
						</li>
					<!-- 이전 페이지 -->
					<!-- paging -->
							<li class="page-item active">
								<a class="page-link" href="#" ></a>
							</li>
					<!-- paging -->
					<!-- 다음  페이지  -->
						<li class="page-item">
							<a class="page-link" href="#" aria-label="Next"> 
								<span aria-hidden="true">&raquo;</span>
							</a>
						</li>
					<!-- 다음  페이지  -->
				</ul>
			</nav>
			<!-- END : 페이지네이션  -->
		</div>
		<!-- container -->
	</section>
	<jsp:include page="/WEB-INF/inc/footer.jsp" ></jsp:include>
</body>
<script type="text/javascript">
</script>
</html>






