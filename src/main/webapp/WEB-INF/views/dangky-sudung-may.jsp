<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>ĐĂNG KÝ MÁY</title>
 <jsp:include page="/WEB-INF/views/layouts/header.jsp" /> 
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
	
	<div class="container MyForm" >
  <form:form action = "${contextPath}/DKSDMay-action" method = "post" onsubmit="return validateFormDKSDMay()"
  modelAttribute="dangKyMay">
    
    <h2>ĐĂNG KÝ SỬ DỤNG MÁY</h2>
    
    <p style="color: red"> ${error}</p>
    
    <div class="form-group">
		<form:label path="maKH">Mã Khách Hàng <span style="color: red;"> *</span></form:label>
		<form:input path="maKH" id = "maKH" name = "maKH"  type="text" class="form-control"
			placeholder="Nhập mã khách hàng (KHxxxxx) x: là ký tự số"  onkeyup = "validateMaKH('maKH','errorMaKH')"
			list="listMaKH" />
	 		<datalist id="listMaKH">
	   				<c:forEach items="${listMaKH}" var="MaKH">
   					<option value="${MaKH}" >${MaKH}</option>
   				</c:forEach> 
			</datalist>
	 	<p id="errorMaKH"  style="color: red"></p> 
	</div>
	
	<div class="form-group">
		<form:label path="maMay">Mã Máy <span style="color: red;"> *</span></form:label>
		<form:input path="maMay" id = "maMay" name = "maMay"  type="text" class="form-control"
			placeholder="Nhập mã máy (MAYxxxx) x: là ký tự số"
			onkeyup="validateMaMay('maMay', 'errorMM')" list ="listMaMay"/>
			 <datalist id="listMaMay">
	   				<c:forEach items="${listMaMay}" var="MaMay">
   					<option value="${MaMay}" >${MaMay}</option>
   				</c:forEach> 
			</datalist>
	 	<p id="errorMM"  style="color: red"></p> 
	</div>
	
	<div class="form-group">
		<form:label path="ngayBDSD">Ngày bắt đầu sử dụng<span style="color: red;"> *</span></form:label>
		<form:input path="ngayBDSD" id = "ngayBDSD" name = "ngayBDSD"  class="form-control" 
		placeholder="Nhập ngày bắt đầu sử dụng"/>
	</div>
    
    <div class="form-group">
		<form:label path="gioBDSD">Giờ bắt đầu sử dụng <span style="color: red;"> *</span></form:label>
		<form:input path="gioBDSD" id = "gioBDSD" name = "gioBDSD"  type="time" class="form-control"
		placeholder="Nhập giờ sử dụng bắt đầu sử dụng"  required="required" />
	</div>
	
	<div class="form-group">
		<form:label path="thoiGianSD">Thời gian sử dụng <span style="color: red;"> *</span></form:label>
		<form:input path="thoiGianSD" id = "thoiGianSD" name = "thoiGianSD"  type="number" class="form-control"
		placeholder="Nhập thời gian sử dụng" onkeyup = "validateNumber('thoiGianSD','errorSL')" />
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