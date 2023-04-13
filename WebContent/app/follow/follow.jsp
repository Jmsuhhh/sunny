<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<<<<<<< HEAD
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/follow.css" />
  </head>
  <body>
<%--  <jsp:include page="${pageContext.request.contextPath}/app/header/header.jsp"/> --%>
    <div class="container">
      <section class="top">
        <div class="button">
          <ul class="top-btn-ul">
            <!-- 팔로우, 팔로잉 리스트를 가져옴 비동기?-->
            <!-- active클래스를 줬다 뺐다 -->
            <li class="top-btn active">팔로워</li>
            <li class="top-btn">팔로잉</li>
          </ul>
        </div>
      </section>
      <section class="bottom">
        <!-- 팔로잉/팔로우 리스트 띄우기 -->
        <div class="follow">
          <ul class="follow-list-ul">
            <li class="follow-list">
              <!-- 이 회원의 마이페이지로 이동 -->
              <a href="#">
                <div class="user-photo">
                  <img src="" alt="" />
                </div>
                <div class="user-name">이름</div>
              </a>
              <!-- 버튼을 누르면 마이페이지에 저장됨 -->
              <!-- following 클래스를 줬다뺐다 -->
              <button class="user-follow">팔로우</button>
            </li>
            <li class="follow-list">
              <a href="">
                <div class="user-photo">
                  <img src="" alt="" />
                </div>
                <div class="user-name">이름</div>
              </a>
              <button class="user-follow">팔로우</button>
            </li>
            <li class="follow-list">
              <a href="">
                <div class="user-photo">
                  <img src="" alt="" />
                </div>
                <div class="user-name">이름</div>
              </a>
              <button class="user-follow">팔로우</button>
            </li>
            <li class="follow-list">
              <a href="">
                <div class="user-photo">
                  <img src="" alt="" />
                </div>
                <div class="user-name">이름</div>
              </a>
              <button class="user-follow">팔로우</button>
            </li>
            <li class="follow-list">
              <a href="">
                <div class="user-photo">
                  <img src="" alt="" />
                </div>
                <div class="user-name">이름</div>
              </a>
              <button type="button" class="user-follow">
                팔로우
              </button>
            </li>
          </ul>
        </div>
      </section>
    </div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/follow.js"></script>
  </body>
=======
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/follow.css" />
</head>
<body>
	<jsp:include
		page="${pageContext.request.contextPath}/app/header/header.jsp" />
	<div class="container">
		<section class="top">
			<div class="button">
				<ul class="top-btn-ul">
					<!-- active클래스를 줬다 뺐다 -->
					<a href="${pageContext.request.contextPath}/follow/followerList.fo?userNumber=${userNumber}">
						<li class="top-btn  active">팔로워</li>
					</a>
					<a href="${pageContext.request.contextPath}/follow/followingList.fo?userNumber=${userNumber}&tab=following">
						<li class="top-btn following-btn">팔로잉</li>
					</a>
				</ul>
			</div>
		</section>
		<section class="bottom">
			<!-- 팔로잉/팔로우 리스트 띄우기 -->
			<div class="follow">
				<ul class="follow-list-ul">
					<c:choose>
						<c:when test="${not empty followList}">
							<c:forEach var="follow" items="${followList}">
								<li class="follow-list">
									<!-- 이 회원의 마이페이지로 이동 --> <a
									href="${pageContext.request.contextPath}/user/myPageOk.us?userNumber=${follow.getUserNumber()}">
										<div class="user-photo">
											<c:choose>
												<c:when test="${empty follow.getFileSystemName()}">
													<img
														src="${pageContext.request.contextPath}/assets/img/myPage/logo.png" />
												</c:when>
												<c:otherwise>
													<img
														src="${pageContext.request.contextPath}/uploadProfile/${follow.getFileSystemName()}"
														alt="" />
												</c:otherwise>
											</c:choose>
										</div>
										<div class="user-name">${follow.getUserNickname()}</div>
								</a> <!-- 버튼을 누르면 마이페이지에 저장됨 --> <!-- following 클래스를 줬다뺐다 -->
									<button class="user-follow" data-userNumber="${follow.getUserNumber()}">팔로우</button>
								</li>
							</c:forEach>
						</c:when>
					</c:choose>
				</ul>
			</div>
		</section>
	</div>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/follow.js"></script>
</body>
>>>>>>> 89923749a59cdf432a0b7c35b44029d1daacb300
</html>
