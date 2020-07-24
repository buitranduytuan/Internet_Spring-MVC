<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>DANH SÁCH MÁY</title>
  <jsp:include page="/WEB-INF/views/layouts/header.jsp" />  
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
<%--  	<jsp:include page="/WEB-INF/views/layouts/page-loader.jsp" />   --%>

	<div class="container mt-3" class ="DanhSach">
		<h2 style="font-size: 28px;">LIỆT KÊ DANH SÁCH MÁY</h2> 	
		
		<!-- Search form -->
		<p>Tìm kiếm thông tin Máy</p>
		<form:form action="${contextPath}/may/search" method="POST" modelAttribute="search" style="margin-bottom: 15px">
			<form:input path ="content" type="text" placeholder="Nhập từ khóa..." name = "content" />
      		<button type="submit" >Search</button>
    	</form:form>
    	
  		<table class="table table-bordered table-striped" id = "tableTuanBTD">
			<thead>
				<tr>
					<th>Mã máy</th>
					<th>Trạng Thái</th>
					<th>Vị trí</th>
	 				<th>Chức năng</th> 
				</tr>
			</thead>
			
			<tbody id="myTable">
				<c:if test="${not empty listMay}">
					<c:forEach items="${listMay}" var="may">
						<tr>
							<td><a href="${contextPath}/may/edit/${may.maMay}">${may.maMay}</a></td>
							<td>${may.trangThai}</td>
							<td>${may.viTri}</td>
							<td>					            
					            <div class="dropdown">
					            <a class="btn btn-info" href="${contextPath}/may/edit/${may.maMay}"> Edit </a>
									<button type="button" class="btn btn-secondary" data-toggle="dropdown">Delete</button>
									<div class="dropdown-menu">
										<a class="dropdown-item text-danger"
											href="${contextPath}/may/delete/${may.maMay}">
											Bạn chắc chắn muốn xóa Máy ${may.maMay}?</a>
										<a class="dropdown-item text-info" href="">Cancel</a>
									</div>
								</div>
					        </td>
						</tr>
						
					</c:forEach>
				</c:if>
			</tbody>
			
		</table>
	
	</div>
	<!-- Footer -->
 	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" /> 
	<!-- Footer -->
</body>
</html>