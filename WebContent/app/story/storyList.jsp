<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>스토리 | 볕 들 무렵</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/storyList.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
      rel="stylesheet"
    />
  </head>
  <body>
   
    <div class="container">
      <article class="bntslide">
        <div class="holder">
          <div class="loopslider" data-pagertype="bullets">
            <ul class="swiper-wrapper">
              <li class="swiper-slide">
                <a href="${pageContext.request.contextPath}">
                  <div class="wraphover">
                    <img
                      src="https://www.shouse.garden/data/banner/220729_024730_734200p.jpg"
                      alt=""
                    />
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </article>
      <h3 class="subtit">볕 들 스토리들</h3>

      <article class="holder2">
        <div class="stroyList sl">
          <ul class="listUl">
	<c:choose>
		<c:when test="${not empty storyList}">
			<c:forEach var="story" items="${storyList}">
				<li class="listLi">
              <div class="top tBox">
                <a href="${pageContext.request.contextPath}"
                  ><div class="p1 proimg"></div>
                  <p class="p1 profile">${story.getUserNickname()}</p></a
                >
                <button
                  type="button"
                  id="follow-button"
                  onclick="toggleFollow(this)"
                  class="p1 follow dir"
                >
                  팔로우
                </button>
              </div>
              <a href="">
                <div class="img-container">
                  <div class="coverimg"></div>
                </div>
                <p class="imgtilte">제목제목</p>
              </a>
            </li>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
				<td colspan="5" align="center">등록된 스토리가 없습니다.</td>
			</tr>
		</c:otherwise>
	</c:choose>
          </ul>
        </div>
        <div class="pagination">
          <ul>
            <li><a href="#" class="prev">&laquo;</a></li>
            <li><a href="#" class="active">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#" class="next">&raquo;</a></li>
          </ul>
        </div>
      </article>
    </div>

    <!-- main -->
    <script src="${pageContext.request.contextPath}/assets/js/storyList.js"></script>
  </body>
</html>