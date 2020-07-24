<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>LIỆT KÊ THÔNG TIN SỬ DỤNG</title>
  <jsp:include page="/WEB-INF/views/layouts/header.jsp" />  
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
<%--  	<jsp:include page="/WEB-INF/views/layouts/page-loader.jsp" />   --%>

	<div class="container mt-3" class ="DanhSach">
		<h2 style="font-size: 28px;">LIỆT KÊ THÔNG TIN SỬ DỤNG</h2> 	
		
    	
  		<table class="table table-bordered table-striped" id = "tableTuanBTD">
			<thead>
				<tr>
					<th>Mã KH</th>
					<th>Tên KH</th>
					<th>Mã máy</th>
	 				<th>Vị trí</th>
	 				<th>Trạng thái</th> 
	 				<th>Ngày BDSD Máy</th> 
	 				<th>Giờ BDSD Máy</th> 
	 				<th>Thời Gian SD Máy</th> 
	 				<th>Mã DV</th> 
	 				<th>Ngày SDDV</th> 
	 				<th>Giờ SDDV</th> 
	 				<th>Số Lượng</th> 
	 				<th>Tổng tiền</th> 
				</tr>
			</thead>
			
			<tbody id="myTable">
				<c:if test="${not empty listThongTin}">
					<c:forEach items="${listThongTin}" var="info">
						<tr>
							<td>${info.maKH}</td>
							<td>${info.tenKH}</td>
							<td>${info.trangThai}</td>
							<td>${info.viTri}</td>
							<td>${info.trangThai}</td>
							<td>${info.ngayBDSDMay}</td>
							<td>${info.gioBDSDMay}</td>
							<td>${info.thoiGianSDMay}</td>
							<td>${info.maDV}</td>
							<td>${info.ngaySD}</td>
							<td>${info.gioSD}</td>
							<td>${info.soLuong}</td>
							<td>${info.tongTien}</td>
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