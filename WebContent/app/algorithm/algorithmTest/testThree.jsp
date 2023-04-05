<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Question 3:</h1>
	<p>Do you have pets in your home?</p>
	<form action="${pageContext.request.contextPath }/algorithmTest/testFour.ag" method="post">
 <input type="hidden" name="selectThree" value="">
  <button type="button" onclick="document.getElementsByName('selectThree')[0].value='O';this.form.submit();">O</button>
  <button type="button" onclick="document.getElementsByName('selectThree')[0].value='X';this.form.submit();">X</button>
	</form>
</body>
</html>