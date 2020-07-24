<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>SỬA DỊCH VỤ</title>
<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
</head>

<body>
	<jsp:include page="/WEB-INF/views/layouts/navbar.jsp" />

	<div class="container MyForm">
		<form:form action="${contextPath}/dichVu/edit-action" method="post"
			onsubmit="return validateFormTaoDV()" modelAttribute="dichVu">

			<h2>SỬA THÔNG TIN DỊCH VỤ</h2>

			<p style="color: red">${error}</p>

			<div class="form-group">
				<form:label path="maDV">Mã Dịch Vụ <span style="color: red;"> *</span> </form:label>
				<form:input path="maDV" id="maDV" name="maDV" type="text" class="form-control" readonly="true" />
			</div>

			<div class="form-group">
				<form:label path="tenDV">Tên Dịch Vụ <span style="color: red;"> *</span> </form:label>
				<form:input path="tenDV" id="tenDV" name="tenDV" type="text"
					class="form-control" placeholder="Nhập tên Dịch Vụ" />
			</div>

			<div class="form-group">
				<form:label path="donViTinh">Đơn Vị Tính <span style="color: red;"> *</span> </form:label>
				<form:select path="donViTinh" id="donViTinh" name="donViTinh" type="text" class="form-control">
					<form:option value="chai"></form:option>
					<form:option value="lon"></form:option>
					<form:option value="gói"></form:option>
					<form:option value="ly"></form:option>
					<form:option value="tô"></form:option>
					<form:option value="card"></form:option>
				</form:select>
			</div>

			<div class="form-group">
				<form:label path="donGia">Đơn Giá <span style="color: red;"> *</span> </form:label>
				<form:input path="donGia" id="donGia" name="donGia" type="number"
					class="form-control" placeholder="Nhập Đơn Giá" onkeyup="validateNumber('donGia','errorDonGia')" />
				<p id="errorDonGia" style="color: red"></p>
			</div>

			<p id="errorRong" style="color: red"></p>
			<button type="submit" class="btn btn-primary" name="submit">Submit</button>
			<a href="${contextPath}/dichVu/list" class="btn btn-secondary">Cancel</a>

		</form:form>
	</div>

	<!-- Footer -->
	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />
	<!-- Footer -->
</body>
</html>