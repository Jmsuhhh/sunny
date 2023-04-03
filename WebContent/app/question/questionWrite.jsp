<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>질문하기</title>
    <link rel="stylesheet" href="${pageContent.request.contextPath}/assets/css/questionWrite.css" />
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
      rel="stylesheet"
    />
    
	 <!-- include libraries(jQuery, bootstrap) -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

    <!-- include summernote css/js -->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
	
    <link rel="stylesheet" href="${pageContent.request.contextPath}/assets/css/questionWrite.css">
  </head>
 
<body>
	<%-- <jsp:include page="${pageContext.request.contextPath}/app/header/header.jsp"/> --%>
    <div class="container">
    <form id="write-form" action="${PageContext.request.contextPath}/question/questionWriteOk.qs" method="post" enctype="multipart/form-data">
      <h1 class="sub-title">
        <span class="story-ico"></span>
        질문하기
        <span class="story-txt">나만의 볕 들 스토리</span>
      </h1>
      <form action="">
      <div class="form-group">
        <input type="text" id="title" name="boardTitle" required placeholder="* 스토리 제목을 입력해주세요!" required/>
      </div>

        <!-- 첨부 파일 -->

        <div class="form-group">
          <div class="image-upload-wrap">
            <input type="file" id="file" name="boardFile"
              accept=".jpg, .jpeg, .png" multiple />
            <div class="image-upload-box">
              <div class="upload-text">
                <div class="upload-icon">
                 <img src="https://www.shouse.garden/images/ico/photo_g.png" class="upload-icon">
                </div>
                <div class="upload-count">
                  커버사진 업로드
                </div>
              </div>
              <div class="upload-text">커버사진 1개만 업로드 가능(<span class="cnt">0</span>/1)</div>
              <div class="upload-text">파일 형식 : jpg, png</div>
              <div class="upload-text">※ 이미지를 등록하면 즉시 반영됩니다.</div>
            </div>
          </div>
          <div class="img-controller-box">
            <ul class="file-list">

            </ul>
          </div>
        </div>
        <!-- 첨부파일 -->

      <h1 class="mini-title">상세 내용 입력</h1>
      <div class="textEditor">
           <textarea id="summernote" name="editordata"></textarea>    
      </div>
       

        <div class="btn-group">
          <button type="submit" class="submit-btn">등록 하기</button>
          <!-- 취소버튼 js로 처리하기 -->
          <button type="button" class="cancel-btn">취소</button>
        </div>
      </form>
    </form>
    </div>
   
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<script src="${pageContent.request.contextPath}/assets/js/questionWrite.js"></script>
    <script>
    $(document).ready(function(){
      $('#summernote').summernote({
          height: 450,
          lang: "ko-KR"
        });
    });
    
      </script>
  </body>
</html>
