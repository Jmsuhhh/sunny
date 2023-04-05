<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Question 2:</h1>
	<p>Do you want a plant that requires a lot of maintenance?</p>
	<form action="${pageContext.request.contextPath }/algorithmTest/testThree.ag" method="post">
<!-- 		<input type="radio" name="answer" value="1"> Yes<br>
		<input type="radio" name="answer" value="0"> No<br>
		<input type="submit" value="Next"> -->
		 <input type="hidden" name="selectTwo" value="">
  <button type="button" onclick="document.getElementsByName('selectTwo')[0].value='O';this.form.submit();">O</button>
  <button type="button" onclick="document.getElementsByName('selectTwo')[0].value='X';this.form.submit();">X</button>
	</form>
</body>
</html>