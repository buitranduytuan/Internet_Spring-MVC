<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>DANH SÁCH KHÁCH HÀNG</title>
  <jsp:include page="/WEB-INF/views/layouts/header.jsp" />  
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
<%--  	<jsp:include page="/WEB-INF/views/layouts/page-loader.jsp" />   --%>

	<div class="container mt-3" class ="DanhSach">
		<h2 style="font-size: 28px;">LIỆT KÊ DANH SÁCH KHÁCH HÀNG</h2> 
		
		<!-- Search form -->
		
		<p>Tìm kiếm thông tin Khách hàng</p>
		<form:form action="${contextPath}/khachHang/search" method="POST" modelAttribute="search" style="margin-bottom: 15px">
			<form:input path ="content" type="text" placeholder="Nhập từ khóa..." name = "content"/>
      		<button type="submit" >Search</button>
    	</form:form>
		
  		<table class="table table-bordered table-striped" id = "tableTuanBTD">
			
			<thead>
				<tr>
					<th>Mã khách hàng</th>
					<th>Tên khách hàng</th>
					<th>Địa chỉ</th>
					<th>Số điện thoại</th>
					<th>Địa Email</th>
					<th>Chức năng</th>
				</tr>
			</thead>
			
			<tbody id="myTable">
				<c:if test="${not empty listKH}">
					<c:forEach items="${listKH}" var="khachHang">
						<tr>
							<td>${khachHang.maKH}</td>
							<td>${khachHang.tenKH}</td>
							<td>${khachHang.diaChi}</td>
							<td>${khachHang.sdt}</td>
							<td>${khachHang.email}</td>
							<td>					            
					            <div class="dropdown">
					            	<a class="btn btn-info" href="${contextPath}/khachHang/edit/${khachHang.maKH}"> Edit </a>
									<button type="button" class="btn btn-secondary" data-toggle="dropdown">Delete</button>
									<div class="dropdown-menu">
										<a class="dropdown-item text-danger"
											href="${contextPath}/khachHang/delete/${khachHang.maKH}">
											Bạn chắc chắn muốn xóa Khách hàng ${khachHang.maKH}?</a>
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