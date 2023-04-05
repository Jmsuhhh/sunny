<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Question 4:</h1>
	<p>Do you want a plant that improves air quality?</p>
	<form action="${pageContext.request.contextPath }/algorithmTest/testFive.ag" method="post">
 <input type="hidden" name="selectFour" value="">
  <button type="button" onclick="document.getElementsByName('selectFour')[0].value='O';this.form.submit();">O</button>
  <button type="button" onclick="document.getElementsByName('selectFour')[0].value='X';this.form.submit();">X</button>
	</form>
</body>
</html>