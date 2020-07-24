<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>ĐĂNG KÝ DỊCH VỤ</title>
 <jsp:include page="/WEB-INF/views/layouts/header.jsp" /> 
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
	
	<div class="container MyForm" >
  <form:form action = "${contextPath}/DKSDDV-action" method = "post" onsubmit="return validateFormDKSDDV()"
  modelAttribute="dangKyDV">
    
    <h2>ĐĂNG KÝ SỬ DỤNG DỊCH VỤ</h2>
    
    <p style="color: red"> ${error}</p>
    
    <div class="form-group">
		<form:label path="maKH">Mã Khách Hàng <span style="color: red;"> *</span></form:label>
		<form:input path="maKH" id = "maKH" name = "maKH"  type="text" class="form-control"
			placeholder="Nhập mã khách hàng (KHxxxxx) x: là ký tự số"  onkeyup = "validateMaKH('maKH','errorMaKH')" list = "listMaKH" />
	 		<datalist id="listMaKH">
	   				<c:forEach items="${listMaKH}" var="MaKH">
   					<option value="${MaKH}" >${MaKH}</option>
   				</c:forEach> 
			</datalist>
	 	<p id="errorMaKH"  style="color: red"></p> 
	</div>
	
	<div class="form-group">
		<form:label path="maDV">Mã Dịch Vụ <span style="color: red;"> *</span></form:label>
		<form:input path="maDV" id = "maDV" name = "maDV"  type="text" class="form-control" placeholder="Nhập mã dịch vụ (DVxxx) x: là ký tự số"
			 onkeyup="validateMaDV('maDV', 'errorMaDV')" list = "listMaDV" />
			 <datalist id="listMaDV">
	   				<c:forEach items="${listMaDV}" var="MaDV">
   					<option value="${MaDV}" >${MaDV}</option>
   				</c:forEach> 
			</datalist>
	 	<p id="errorMaDV"  style="color: red"></p> 
	</div>
	
	<div class="form-group">
		<form:label path="ngaySD">Ngày Sử Dụng<span style="color: red;"> *</span></form:label>
		<form:input path="ngaySD" id = "ngaySD" name = "ngaySD" class="form-control" placeholder="Nhập ngày sử dụng"/>
	</div>
    
    <div class="form-group">
		<form:label path="gioSD">Giờ sử dụng <span style="color: red;"> *</span></form:label>
		<form:input path="gioSD" id = "gioSD" name = "gioSD"  type="time" class="form-control" placeholder="Nhập giờ sử dụng" required="required" />
	</div>
	
	<div class="form-group">
		<form:label path="soLuong">Số Lượng <span style="color: red;"> *</span></form:label>
		<form:input path="soLuong" id = "soLuong" name = "soLuong"  type="number" class="form-control" placeholder="Nhập số lượng" 
		onkeyup = "validateNumber('soLuong','errorSL')" />
		<p id = "errorSL" style="color: red"></p>
	</div>
 
    <p id="errorRong"  style="color: red"></p> 
   <button type="submit" class="btn btn-primary" name="submit">Submit</button>
   <button type="reset" class="btn btn-secondary" name="submit">Reset</button>
	
  </form:form>
</div>

	<!-- Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />
	<!-- Footer -->
</body>
</html>