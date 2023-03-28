<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>볕 들 스토리 | 볕 들 무렵</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/storyWrite.css" />
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
      rel="stylesheet"
    />
    <!-- include libraries(jQuery, bootstrap) -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <!-- include summernote css/js -->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
  </head>
  <body>
    <div class="container">
        <h1 class="sub-title">
          <span class="story-ico"></span>
          스토리 글쓰기
          <span class="story-txt">나만의 볕 들 스토리</span>
        </h1>
        <div class="form-group">
          <input type="text" id="title" name="boardTitle" required placeholder="* 스토리 제목을 입력해주세요!"/>
        </div>

        <div class="form-group">
          <div class="image-upload-wrap">
            <input type="file" id="file" name="boardFile" accept=".jpg, .jpeg, .png" multiple />
            <div class="image-upload-box">
              <div class="upload-text">
                <div class="upload-icon">
                  <img src="https://www.shouse.garden/images/ico/photo_g.png" class="upload-icon" />
                </div>
                <div class="upload-count">
                  커버사진 업로드
                </div>
              </div>
              <div class="upload-text">커버사진 1개만 업로드 가능(<span class="cnt">0</span>/1)</div>
              <div class="upload-text">파일 형식 : jpg, png, jpeg</div>
              <div class="upload-text">※ 이미지를 등록하면 즉시 반영됩니다.</div>
            </div>
            <div class="img-controller-box">
              <ul class="file-list"></ul>
            </div>
          </div>
        </div>

      <h1 class="mini-title">상세 내용 입력</h1>
<textarea id="summernote" name="boardContent"></textarea>
<script>
  $(document).ready(function () {
    $("#summernote").summernote({
      height: 400,
      lang: "ko-KR",
      toolbar: [
        ["style", ["style"]],
        ["font", ["bold", "italic", "underline", "clear"]],
        ["fontname", ["fontname"]],
        ["color", ["color"]],
        ["para", ["ul", "ol", "paragraph"]],
        ["table", ["table"]],
        ["insert", ["link", "picture", "video"]],
        ["view", ["codeview"]],
      ],
      placeholder: "*스토리 내용을 입력해주세요!",
    });
  });
</script>
 <form action="${pageContext.request.contextPath}/app/story/storyList.jsp" method="post">
    <!-- 폼 내용 -->
    <div class="btn-groups">
      <button type="submit" class="submit-btn">등록 하기</button>
      <button type="button" class="cancel-btn">취소</button>
    </div>
  </form>
    </div>

       <script src="${pageContext.request.contextPath}/assets/js/storyWrite.js"></script>
  </body>
</html>
