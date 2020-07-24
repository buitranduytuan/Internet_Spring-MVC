<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>DANH SÁCH DỊCH VỤ</title>
  <jsp:include page="/WEB-INF/views/layouts/header.jsp" />  
  <jsp:include page="/WEB-INF/views/layouts/navbar.jsp" /> 
</head>

<body> 	 
   	
	<div class="container mt-3" class ="DanhSach">
		<h2 style="font-size: 28px">LIỆT KÊ DANH SÁCH DỊCH VỤ</h2> 	
		
		<!-- Search form -->
		<p>Tìm kiếm thông tin Dịch vụ</p>
		<form:form action="${contextPath}/dichVu/search" method="POST" modelAttribute="search" style="margin-bottom: 15px">
			<form:input path ="content" type="text" placeholder="Nhập từ khóa..." name = "content"/>
      		<button type="submit" >Search</button>
    	</form:form>
    	
  		<table class="table table-bordered table-striped " id = "tableTuanBTD">
			
			<thead>
				<tr>
					<th>Mã Dịch Vụ</th>
					<th>Tên Dịch Vụ</th>
					<th>Đơn Vị Tính</th>
					<th>Đơn Giá</th>
					<th>Chức Năng</th>
				</tr>
			</thead>
			
			<tbody id="myTable">
				<c:if test="${not empty listDV}">
					<c:forEach items="${listDV}" var="dichVu">
						<tr>
							<td>${dichVu.maDV}</td>
							<td>${dichVu.tenDV}</td>
							<td>${dichVu.donViTinh}</td>
							<td>${dichVu.donGia}</td>
							<td>					            
					            <div class="dropdown">
					            	<a class="btn btn-info" href="${contextPath}/dichVu/edit/${dichVu.maDV}"> Edit </a>
									<button type="button" class="btn btn-secondary" data-toggle="dropdown">Delete</button>
									<div class="dropdown-menu">
										<a class="dropdown-item text-danger"
											href="${contextPath}/dichVu/delete/${dichVu.maDV}">
											Bạn chắc chắn muốn xóa Khách hàng ${dichVu.maDV}?</a>
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