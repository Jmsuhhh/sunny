<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3번</title>
<link
      href="${pageContext.request.contextPath}https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/algorithm/testThree.css" />
</head>
<body>
	    <section id="qna" class="mx-auto my-5 py-5 px-3">
      <progress value="120" max="200" id="my_skill"></progress>
      <a href="${pageContext.request.contextPath}http://127.0.0.1:5500/html/FindMyPlant/main/index.html">
      <img src="${pageContext.request.contextPath}/assets/img/algorithm/index/home.png" 
        class = "img"></a>
      <div class="questionContainer">
        <a href="http://127.0.0.1:5500/html/FindMyPlant/test2/test2.html">
        <input
          class ="back"
          type="image"
          src="${pageContext.request.contextPath}/assets/img/algorithm/testTwo/back.png"
          value="뒤로가기"
        />
        </a>
        <h1>3. 식물의 관리를 위해 매일 시간을 내실 수 있나요?  </h1>
      </div>
      <div class="answerContainer">
        <a href="${pageContext.request.contextPath}http://127.0.0.1:5500/html/FindMyPlant/test4/test4.html">
        <ul>
          <li style="list-style-type: none">
            <button class="btn true">YES</button>
          </li>
          <li style="list-style-type: none">
            <button class="btn no">NO</button>
            </li>
         </ul>
       </a>
      </div>
    </section>
    <script src ="${pageContext.request.contextPath}/assets/js/algorithm/test1.js"></script>
</body>
</html>