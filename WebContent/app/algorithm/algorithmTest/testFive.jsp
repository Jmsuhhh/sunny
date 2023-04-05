<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Find My Plant</title>
</head>
<body>
	<h1>Question 5:</h1>
	<p>Do you want a plant with flowers?</p>
	<form action="/algorithmTest/loading.ag" method="post">
 <input type="hidden" name="selectFive" value="">
  <button type="button" onclick="document.getElementsByName('selectFive')[0].value='O';this.form.submit();">O</button>
  <button type="button" onclick="document.getElementsByName('selectFive')[0].value='X';this.form.submit();">X</button>
	</form>
</body>
</html>