<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>식고수페이지</title>
     <link rel="stylesheet" href="${pageContent.request.contextPath}/assets/css/questionList.css">
</head>
<body>
	<jsp:include page="${pageContext.request.contextPath}/app/header/header.jsp"/>
    <div class="pcontainer">
      <div class="info">
        <h3> <strong>
          9지인
          <!-- 회원닉네임 가져오기 -->
          <c:out value="#"/>
        </strong> 
        님의 질문목록</h3>
        <div class="infozone">
          <h3> <strong>글작성팁</strong>
            식물에게 문제가 생기면 고수님에게 직접 도움을 요청해보세요
          </h3>
          <img src="data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iNzIiIGhlaWdodD0iNDAiIHZpZXdCb3g9IjAgMCA3MiA0MCIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIj4KICAgIDxnIGZpbGw9Im5vbmUiIGZpbGwtcnVsZT0iZXZlbm9kZCI+CiAgICAgICAgPHBhdGggZD0iTTQyLjY5IDBoMTUuMjI4YzEuNzU3IDAgMy40My4zNDggNC45NTEuOTc3QzY4LjIxMyAzLjAyIDcyIDguMDc0IDcyIDEzLjk5OWMwIDcuMDkyLTUuNDE4IDEzLjA2NS0xMi40NDUgMTMuOTg2LTEuMDIxLjEzNC0xLjkzNy0uNjMxLTEuOTM3LTEuNjM1di0xLjY0NUg0Mi42OWMtNy4wMDggMC0xMi42OS01LjUzLTEyLjY5LTEyLjM1M0MzMCA1LjUzMSAzNS42ODIgMCA0Mi42OSAwIiBmaWxsPSIjODBEQkI0Ii8+CiAgICAgICAgPGcgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoNDEgMTEpIiBmaWxsPSIjRkZGIj4KICAgICAgICAgICAgPGNpcmNsZSBjeD0iMiIgY3k9IjIiIHI9IjIiLz4KICAgICAgICAgICAgPGNpcmNsZSBjeD0iMTAiIGN5PSIyIiByPSIyIi8+CiAgICAgICAgICAgIDxjaXJjbGUgY3g9IjE4IiBjeT0iMiIgcj0iMiIvPgogICAgICAgIDwvZz4KICAgICAgICA8Zz4KICAgICAgICAgICAgPHBhdGggZD0iTTI5LjMxIDEySDE0LjA4MmMtMS43NTcgMC0zLjQzLjM0OC00Ljk1MS45NzdDMy43ODcgMTUuMDIgMCAyMC4wNzQgMCAyNS45OTljMCA3LjA5MiA1LjQxOCAxMy4wNjUgMTIuNDQ1IDEzLjk4NiAxLjAyMS4xMzQgMS45MzctLjYzMSAxLjkzNy0xLjYzNXYtMS42NDVIMjkuMzFjNy4wMDggMCAxMi42OS01LjUzIDEyLjY5LTEyLjM1M0M0MiAxNy41MzEgMzYuMzE4IDEyIDI5LjMxIDEyIiBmaWxsPSIjNDVDNTlCIi8+CiAgICAgICAgICAgIDxwYXRoIGQ9Ik0xNS42NjcgMjIuMjVoLS44OWMtLjk4MSAwLTEuNzc3Ljc4My0xLjc3NyAxLjc1djUuMjVjMCAuOTY3Ljc5NiAxLjc1IDEuNzc4IDEuNzVoLjg4OWMuNDkgMCAuODg5LS4zOTIuODg5LS44NzV2LTdhLjg4Mi44ODIgMCAwIDAtLjg5LS44NzVtMTEuNTU2IDBoLTQuNDQ0bC43MzQtMi43MDZhMS43MzcgMS43MzcgMCAwIDAtLjczOC0xLjg4bC0uNzg3LS41MTdhLjg5Ny44OTcgMCAwIDAtMS4yODguMzM3bC0yLjAwNCA0LjAzOWEzLjQ1NiAzLjQ1NiAwIDAgMC0uMzYxIDEuNTM2djYuMTkxYzAgLjk2Ny43OTUgMS43NSAxLjc3NyAxLjc1aDYuMDQ0Yy44NDcgMCAxLjU3Ny0uNTg5IDEuNzQzLTEuNDA3bDEuMDY3LTUuMjVjLjIyLTEuMDgyLS42MjItMi4wOTMtMS43NDMtMi4wOTMiIGZpbGw9IiMxNTlBNkQiLz4KICAgICAgICA8L2c+CiAgICA8L2c+Cjwvc3ZnPgo=" alt="">
        </div>
      </div>
  
        <div class="question">
            <h3 class="qq">질문</h3>
            <div class="q1">
                <div class="noanswer">
                   <button type="button">미답변</button>

                  <!-- ========== 게시글 목록 =========== -->
                  <c:choose>
                  	<c:when test="${not empty questionList}">
                  		<c:forEach var="question" items="${questionList}">
                  			    <div class="postingList">
                   				 <div class="p">
                      			<!-- 이미지 클릭하면 그 게시물로 이동 -->
                     			 <a href="#">
                      				  <img src="../20230321_104528.png" alt="" class="imgz">
                      			</a>
                     			 <!-- 스토리 제목  -->
                     			 <div class="title">이거 어떻게 키우나요</div>
                    </div>
                  		</c:forEach>
                  	</c:when>
                  	<c:otherwise>
                  		<tr>
                  			<td colspan="3" align="center"></td>
                  		</tr>
                  	</c:otherwise>
                  </c:choose>
                  
              
                    
                </div>
                    <!-- ========== 게시글 목록 =========== -->
                 
                  
                   <!-- ========== 페이징 처리 ============ -->
                   <div class="pagination">
                    <ul>
                       <li><a href="#" class="prev">&lt;</a></li>
                       <li><a href="#" class="active">1</a></li>
                       <li><a href="#">2</a></li>
                       <li><a href="#">3</a></li>
                       <li><a href="#" class="next">&gt;</a></li>
                       <!-- ========== 페이징 처리 ============ -->
                     </ul>
                   </div>
                      <!-- ========== 페이징 처리============ -->
                  
                    </div>
                  <div class="answercom">
                     <button type="button">답변완료</button>
  
                     <!-- ========== 게시글 목록 =========== -->
                     <div class="postingList">
                      <div class="p">
                        <!-- 이미지 클릭하면 그 게시물로 이동 -->
                        <a href="#">
                          <img src="../20230321_104528.png" alt="" class="imgz">
                        </a>
                        <!-- 스토리 제목 js -->
                        <div class="title">23.03.21 궁금한게 있습니다</div>
                      </div>
                      <div class="p">
                        <a href="#">
                          <img src="../2.png" alt="" class="imgz">
                        </a>
                        <div class="title">이거 어떻게 키우나요?</div>
                      </div>
                      <div class="p">
                        <a href="#">
                          <img src="../3.png" alt=""class="imgz">
                        </a>
                        <div class="title">궁금해요</div>
                      </div>
                    </div>
                      <!-- ========== 게시글 목록 =========== -->
                  </table>
                    
                     <!-- ========== 페이징 처리 ============ -->
                     <div class="pagination">
                     <ul>
                        <li><a href="#" class="prev">&lt;</a></li>
                        <li><a href="#" class="active">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#" class="next">&gt;</a></li>
                        <!-- ========== 페이징 처리 ============ -->
                      </ul>
                    </div>
                    </div>
                  </div>
               </div>
                </div>

    </div>
    <script src="${pageContent.request.contextPath}/assets/js/questionList.js"></script>
</body>
</html>

