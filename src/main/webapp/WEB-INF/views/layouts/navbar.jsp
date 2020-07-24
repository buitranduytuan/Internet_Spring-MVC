<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Navbar  -->
<nav class="navbar navbar-expand-sm bg-primary navbar-light justify-content-center ">
   
  <a class="navbar-brand" href="${contextPath}"><img src="${contextPath}/resources/img/fpt-logo.png" alt=""></a>
  <a class="navbar-brand" href="${contextPath}">
  <h4 style="padding: 0; margin: 5px; color: white">TuanBTD</h4>
  </a>
  
  <ul class="navbar-nav nav nav-pills">
   
    <li class="nav-item">
      <div class="dropdown">
              <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> Tạo Mới
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="${contextPath}/may/add">Tạo mới Máy</a>
                <a class="dropdown-item" href="${contextPath}/khachHang/add">Tạo mới Khách hàng</a>
                <a class="dropdown-item" href="${contextPath}/dichVu/add">Tạo mới Dịch Vụ</a>
              </div>
       </div>
    </li>
    
    <li class="nav-item">
      <div class="dropdown">
              <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> Liệt Kê Danh Sách
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="${contextPath}/may/list">Liệt kê danh sách Máy</a>
                <a class="dropdown-item" href="${contextPath}/dichVu/list">Liệt kê danh sách Dịch vụ</a>
                <a class="dropdown-item" href="${contextPath}/khachHang/list">Liệt kê danh sách Khách Hàng</a>
                <a class="dropdown-item" href="${contextPath}/DKSDDV-list">Liệt kê toàn bộ thông tin khách hàng</a>
              </div>
          </div>
    </li>
    
    <li class="nav-item">
      <div class="dropdown">
              <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"> Đăng Ký Sử Dụng
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="${contextPath}/formDKSDMay">Đăng ký sử dụng Máy</a>
                <a class="dropdown-item" href="${contextPath}/formDKSDDV">Đăng ký sử dụng Dịch vụ</a>
              </div>
          </div>
    </li> 
    
     <li class="nav-item">
    	<c:set var="now" value="<%=new java.util.Date()%>" />
      	<div class="dropdown">
              <button type="button" class="btn btn-primary">
              	<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now}" />
              </button>
        </div>
    </li>
    
    </ul>   
</nav>