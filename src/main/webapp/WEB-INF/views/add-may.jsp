<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>TẠO MÁY</title>
 <jsp:include page="/WEB-INF/views/layouts/header.jsp" /> 
</head>

<body>
   	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />  
	
<div class="container MyForm" >
  <form:form action = "${contextPath}/may/add-action" method = "post" onsubmit="return validateFormTaoMay()"
  modelAttribute="may">
    
    <h2>TẠO MÁY MỚI</h2>
    
    <p style="color: red"> ${error}</p>
    
    <div class="form-group">
		<form:label path="maMay">Mã Máy <span style="color: red;"> *</span></form:label>
		<form:input path="maMay" id = "maMay" name = "maMay"  type="text" class="form-control"
			placeholder="Nhập mã máy (MAYxxxx) x: là ký tự số"  onkeyup="validateMaMay()"/>
		<form:errors path="maMay" style="color: red" />
	 	<p id="errorMM"  style="color: red"></p> 
	</div>
	
	<div class="form-group">
		<form:label path="trangThai">Trạng Thái <span style="color: red;"> *</span></form:label>
		<form:select path="trangThai" id = "trangThai" name = "trangThai" type = "text" class="form-control">
			<form:option value="Có người dùng"></form:option>
			<form:option value="Đang rảnh"></form:option>
			<form:option value="Đang sửa chữa"></form:option>			
		</form:select>
	</div>
    
    <div class="form-group">
		<form:label path="viTri">Vị Trí <span style="color: red;"> *</span></form:label>
		<form:input path="viTri" id = "viTri" name = "viTri"  type="text" class="form-control" placeholder="Nhập vị trí" />
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