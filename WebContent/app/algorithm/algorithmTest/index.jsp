<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Welcome to Find My Plant Service</h1>
	<p>Answer the following questions to find your perfect plant match!</p>
	<form action="${pageContext.request.contextPath }/algorithmTest/testOne.ag" method="post">
		<input type="submit" value="Start Test">
	</form>
</body>
</html>