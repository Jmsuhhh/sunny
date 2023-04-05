<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Question 1:</h1>
	<p>Do you have a lot of natural light in your home?</p>
	<form action="${pageContext.request.contextPath }/algorithmTest/testTwo.ag" method="post">
 <input type="hidden" name="selectOne" value="">
  <button type="button" onclick="document.getElementsByName('selectOne')[0].value='O';this.form.submit();">O</button>
  <button type="button" onclick="document.getElementsByName('selectOne')[0].value='X';this.form.submit();">X</button>
	</form>
</body>
</html>