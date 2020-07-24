<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Error</title>
    <jsp:include page="/WEB-INF/views/layouts/header.jsp" />
</head>
<body>

    <div class="container">
        <div class="row">
             <div class="error-server">
                <h1>${errorCode}</h1>
                <p>${errorMsg} <a class="btn btn-default" href="${contextPath}">Back to Home</a></p>
            </div>
        </div>
    </div>

</body>
</html>