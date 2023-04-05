<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>결과 페이지</title>
</head>
<body>
	<h1>당신의 반려식물은 <%= request.getAttribute("plantName") %> 입니다!</h1>
	<p><%= request.getAttribute("plantContent") %></p>
	<%-- <h1>당신의 반려식물은 <%= (String) request.getAttribute("plantName") != null ? request.getAttribute("plantName") : "" %> 입니다!</h1>
<p><%= (String) request.getAttribute("plantContent") != null ? request.getAttribute("plantContent") : "" %></p> --%>

</body>
</html>