<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Loading...</title>
	<style>
		.loading {
			margin-top: 50px;
			display: flex;
			align-items: center;
			justify-content: center;
		}
		.loading-text {
			margin-left: 20px;
			font-size: 30px;
			font-weight: bold;
		}
	</style>
</head>
<body>
<form action="${pageContext.request.contextPath }/algorithmTest/result.ag" method="post">
	<div class="loading">
		<div class="spinner-border text-primary" role="status">
  			<span class="sr-only">Loading...</span>
		</div>
		<div class="loading-text">Loading...</div>
	</div>
	</form>
	<script src="../../../assets/js/algorithm/result.js"></script> 
</body>
</html>   