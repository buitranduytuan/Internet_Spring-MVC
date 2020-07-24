<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>SỬA KHÁCH HÀNG</title>
 <jsp:include page="/WEB-INF/views/layouts/header.jsp" /> 
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
	
<div class="container MyForm" >
  <form:form action = "${contextPath}/khachHang/edit-action" method = "post" onsubmit="return validateTaoKH()"
  modelAttribute="khachHang">
    
    <h2>SỬA THÔNG TIN KHÁCH HÀNG</h2>
    
    <p style="color: red"> ${error}</p>
    
    <div class="form-group">
		<form:label path="maKH">Mã Khách Hàng: <span style="color: red;"> *</span></form:label>
		<form:input path="maKH" id = "maKH" name = "maKH"  type="text" readonly = "true" class="form-control" />
	</div>
	
	<div class="form-group">
		<form:label path="tenKH">Tên khách hàng<span style="color: red;"> *</span></form:label>
		<form:input path="tenKH" id = "tenKH" name = "tenKH"  type="text" class="form-control"
				placeholder="Nhập tên Khách Hàng" />
	</div>
    
    <div class="form-group">
		<form:label path="diaChi">Địa Chỉ <span style="color: red;"> *</span></form:label>
		<form:input path="diaChi" id = "diaChi" name = "diaChi"  type="text" class="form-control"
			placeholder="Nhập diaChi" />
	</div>
	
	<div class="form-group">
		<form:label path="sdt">Số Điện Thoại <span style="color: red;"> *</span></form:label>
		<form:input path="sdt" id = "sdt" name = "sdt"  type="text" class="form-control"
			placeholder="Nhập số điện thoại" onkeyup = "validatePhone('sdt','errorPhone')"/>
		<p id= "errorPhone" style="color: red"></p>
	</div>
	
	<div class="form-group">
		<form:label path="email">Địa chỉ Email <span style="color: red;"> *</span></form:label>
		<form:input path="email" id = "email" name = "email"  type="text" class="form-control"
		placeholder="Nhập email"  onkeyup = "validateEmail('email','errorEmail')"/>
		<p id= "errorEmail" style="color: red"></p>
	</div>

    
    <p id="errorRong"  style="color: red"></p> 
   <button type="submit" class="btn btn-primary" name="submit">Submit</button>
   <a href="${contextPath}/khachHang/list" class="btn btn-secondary">Cancel</a>
	
  </form:form>
</div>

	<!-- Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />
	<!-- Footer -->
</body>
</html>