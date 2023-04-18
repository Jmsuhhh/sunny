<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입 | 볕 들 무렵</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/join.css">
  <style>
    @font-face {
      font-family: SpoqaHanSans-Regular;
      src: url(/assets/font/SpoqaHanSansRegular.woff2);
    }

    @font-face {
      font-family: SpoqaHanSans-Bold;
      src: url(/assets/font/SpoqaHanSansBold.woff2);
    }
  </style>
</head>

<body>
  <article class="modal-box">
    <div class="agree-box">
      <div class="x-box">
        <div>x</div>
      </div>
      <p class="txt1">서비스 이용약관</p>
      <span class="txt2">제1조 (목적)</span>
      <p class="txt3">
        볕들무렵 이용약관(이하 “약관”이라 합니다)은 주식회사 코딩팩토리(이하 “회사”)가 제공하는 서비스와 관련하여 회사와 이용 고객(또는 회원) 간의 이용 조건 및 절차, 회사와 회원 간의 권리, 의무 및
        책임 사항을 포함한 기타 필요한 사항을 규정함을 목적으로 합니다.</p>
      <span class="txt2">제2조 (약관)</span>
      <p class="txt3">1. 본 약관은 회원이 쉽게 알 수 있도록 약관의 내용과 상호, 소재지, 대표자의 성명, 사업자등록번호, 연락처 등을 회사의 초기 서비스화면에 게시하거나 기타의 방법으로
        회원에게 공지함으로써 효력이 발생합니다<br>
        2. 회사는 약관의 규제에 관한 법률, 정보통신망 이용촉진 및 정보보호 등에 관한 법률 등 관계법령에 위배되지 않는 범위 내에서 본 약관을 개정할 수 있습니다.<br>
        3. 회사가 약관을 개정하는 경우 회사는 개정 사유 및 적용 일자를 명시하여 현행 약관과 함께 적용일자 7일 전부터 적용 전일까지 제1항의 방법으로 공지합니다. 다만, 회원의 권리 또는 의무에 관한
        중요한 규정의 변경은 최소한 30일전에 공지하고 개정약관을 회원이 등록한 전자우편으로 발송하여 통지합니다.<br>
        4. 회사가 제3항에 따라 개정약관을 공지 또는 통지하였음에도 불구하고 회원이 명시적으로 거부의사를 표시 하지 아니하는 경우 회원이 개정약관에 동의한 것으로 봅니다.<br>
        5. 본 약관에 동의하는 것은 서비스를 정기적으로 방문하여 약관의 변경사항을 확인하는 것에 동의함을 의미 하며, 따라서 변경된 약관에 대한 정보를 알지 못하여 발생하는 회원의 피해에 대하여 회사는
        책임을 지지 않습니다.</p>
    </div>
  </article>

  <article class="modal-box2">
    <div class="agree-box2">
      <div class="x-box2">
        <div>x</div>
      </div>
      <p class="private-txt1">개인정보처리방침</p>
      <p class="private-txt2">주식회사 코딩팩토리(이하 "회사"라 합니다)는 회사가 제공하는 볕들무렵 서비스(이하 "서비스"라 합니다) 회원의 개인정보보호를 중요시하며, 『정보통신망 이용촉진
        및 정보보호 등에 관한 법률』등 개인정보와 관련된 법령상의 개인정보보호규정을 준수하고 있습니다.<br>
        회사는 아래와 같이 개인정보처리방침을 명시하여 회원이 회사에 제공한 개인정보가 어떠한 용도와 방식으로 이용되고 있으며 개인정보보호를 위해 어떠한 조치를 취하는지 알려드립니다. <br>
        회사의 서비스 개인정보처리방침은 정부의 법률 및 지침의 변경과 당사의 약관 및 내부 정책에 따라 변경될수 있으며 이를 개정하는 경우 회사는 변경사항에 대하여 즉시 서비스 화면에 게시하오니 회원님께서는 사이트 방문 시
        수시로 확인하시기 바랍니다.</p>
      <p class="private-txt3">1. 볕들무렵은 이용하는 서비스의 형태에 따라 다음과 같은 개인정보를 수집 및 이용∙제공∙파기하고 있습니다.</p>
      <p class="private-txt4">
        ① 개인정보의 수집 ∙ 이용 목적 및 항목 <br>
        회사가 제공하는 서비스는 별도의 회원가입 절차 없이 자유롭게 콘텐츠에 접근할 수 있습니다. 회사의 회원제 서비스 이용을 위해 수집 ∙ 이용하는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며,
        목적 변경 시 별도의 동의를 받는 등 필요한 조치를 이행합니다.
        <br>
        ② 개인정보 수집 방법 <br>
        1) 회원가입 및 서비스 이용 과정에서 이용자가 개인정보 수집에 대해 동의를 하고 직접 정보를 입력하는 경우, 해당 개인정보를 수집합니다. <br>
        2) 고객센터를 통한 상담 과정에서 웹 페이지, 메일, 팩스, 전화 등을 통해 이용자의 개인정보가 수집될 수 있습니다. <br>
        3) 회사와 제휴한 외부 기업이나 단체로부터 개인정보를 제공받을 수 있으며, 이러한 경우에는 제휴사에서 이용자에게 개인정보 제공 동의를 받은 후 수집 합니다. <br>
        ③ 개인정보 보유 ∙ 이용 기간 <br>
        1) 회사는 이용자로부터 개인정보 수집 시에 동의 받은 보유 · 이용기간 내에서 개인정보를 처리·보유합니다. <br>
        - 회원 정보: 회원탈퇴 후 1 개월 일까지 <br>
        - 비회원 정보: 업무 목적 달성 시까지 <br>
        - 서비스 이용에 따른 채권·채무관계 정산 시까지 <br>
        2) 1 년 간 회원의 서비스 이용 기록이 없는 경우, 『정보통신망 이용촉진 및 정보보호등에 관한 법률』 제 29 조에 근거하여 회원에게 사전 통지하고, 별도 보관합니다. <br>
        3) 회원에서 탈퇴한 후 회원 재가입, 임의 해지 등을 반복적으로 행하여 회사가 제공하는 할인쿠폰, 이벤트 혜택 등으로 경제상의 이익을 취하거나 이 과정에서 명의를 무단으로 사용하는 편법과 불법행위를
        하는 회원을 차단 하고자 회원 탈퇴 후 1 개월 동안 보관합니다. <br>
        4) 단, 전자상거래 등에서의 소비자보호에 관한 법률 등 관련 법령의 규정에 따라 거래 관계 확인을 위해 개인정보를 일정기간 보유 할 수 있습니다.</p>
        <p class="private-txt3">
        2. 서비스의 제공 또는 법령에 정해진 책임의 준수를 위하여 회사가 보관하고 있는 개인정보가 제 3 자에게 수집 목적 범위 내에서 제공될 수 있습니다.</p>
        <p class="private-txt4">
        ① 회사는 이용자의 개인정보를 명시한 범위 내에서만 처리하며, 정보주체의 동의, 법률의 특별한 규정에 해당하는 경우에만 개인정보를 제 3 자에게 제공합니다. <br>
        ② 회사는 다음과 같이 개인정보를 제 3 자에게 제공하고 있습니다.
        <br><br><br>
        본 방침은 : 2023년 4월 20일부터 시행됩니다.
      </p>
    </div>
  </article>

  <article class="modal-box3">
    <div class="agree-box3">
      <div class="x-box3">
        <div>x</div>
      </div>
      <p class="choice-txt1">마케팅 수신동의(선택)</p>
      <p class="choice-txt2"><마케팅 수신동의 내용></p>
      <p class="choice-txt3">이메일, PUSH를 통한 볕 들 무렵에서 진행하는 이벤트, <br>
        마케팅,프로모션에 대한 정보 수신에 동의 합니다.</p>
    </div>
  </article>


  <div class="container">
    <div class="nav">
      <div class="menu">
        <a href="/main/mainOk.ma">홈</a>
        <a href="/user/join.us">회원가입</a>
      </div>
    </div>
    <div class="main-container">
      <div class="mem-join">
        <div class="logo">
          <svg xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 384 512"><!--! Font Awesome Pro 6.3.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. -->
            <path
              d="M384 312.7c-55.1 136.7-187.1 54-187.1 54-40.5 81.8-107.4 134.4-184.6 134.7-16.1 0-16.6-24.4 0-24.4 64.4-.3 120.5-42.7 157.2-110.1-41.1 15.9-118.6 27.9-161.6-82.2 109-44.9 159.1 11.2 178.3 45.5 9.9-24.4 17-50.9 21.6-79.7 0 0-139.7 21.9-149.5-98.1 119.1-47.9 152.6 76.7 152.6 76.7 1.6-16.7 3.3-52.6 3.3-53.4 0 0-106.3-73.7-38.1-165.2 124.6 43 61.4 162.4 61.4 162.4.5 1.6.5 23.8 0 33.4 0 0 45.2-89 136.4-57.5-4.2 134-141.9 106.4-141.9 106.4-4.4 27.4-11.2 53.4-20 77.5 0 0 83-91.8 172-20z" />
          </svg>
          <div class="text-logo">
            볕 들 무렵
          </div>
          <div class="join-logo"> 회원가입</div>
        </div>
        <form action="${pageContext.request.contextPath}/user/joinOk.us" method="post">
          <div class="input-tag">
            <div class="input-text">아이디</div>
            <br>
            <input type="text" id="id" name="userId" placeholder="아이디" minlength="5" maxlength="10" required>
            <span class="check-msg" id="check-id-msg"></span>
            <br><br><br>
            <div class="input-text">비밀번호</div>
            <br>
            <input type="password" id="password" name="userPassword" placeholder="비밀번호" minlength="8" maxlength="15" required>
            <span class="check-msg" id="check-pw-msg"></span>
            <br><br>
            <input type="password" id="confirm-password" name="userPassword" placeholder="비밀번호 확인" minlength="8" maxlength="15" required>
            <span id="password-error"></span>
            <br><br><br>
            <div class="input-text">이름</div> <br>
            <input type="text" placeholder="이름" name="userName" maxlength="10" required>
            <span id="name-error"></span>
            <br><br><br>
            <div class="input-text3">
              <div class="input-text">닉네임</div>
              <!-- <div class="input-text2">(변경 불가)</div> -->
            </div> <br>
            <input type="text" placeholder="닉네임(2~10자)" name="userNickname" minlength="2" maxlength="10" required>
            <span id="nickname-error" class="error"></span>
            <br><br><br>
            <div class="input-text">
              연락처</div> <br>
            <input type="tel" placeholder="010-1234-5678" name="userPhone" maxlength="13" required>
            <span class="check-msg" id="phone-msg"></span>
            <br><br><br>
            <div class="input-text">이메일</div> <br>
            <input type="email" name="userEmail" placeholder="aa123@naver.com" required onblur="validateEmail()">
            <span class="check-msg" id="check-email-msg"></span>
            <br><br><br>
            <div class="input-text">
              <label for="select">비밀번호 찾기 질문</label>
            </div> <br>
            <select name="findQuestionNumber" id="select" required>
            <!-- <option value="-1" selected>--선택--</option> -->
              <option value="1" selected>가장 좋아하는 색깔은?</option>
              <option value="2">가장 좋아하는 계절은?</option>
              <option value="3">가장 소중한 것은?</option>
            </select>
            <br><br><br>
            <div class="input-text">비밀번호 찾기 답변</div> <br>
            <input type="text" placeholder="선택한 비밀번호 질문의 답을 입력하세요" name="findPasswordAnswer" required>
            <br><br><br><br>
            <div class="input-text">약관동의</div><br>
            <div class="agree">
              <label for="">전체 동의</label>
              <input type="checkbox" value="전체 동의">
            </div>
            <div class="agree2">
              <div class="label-box">
                <div class="required-box">
                  <label class="required1">이용약관</label>
                  <label for="agree" class="required2">(필수)</label>
                </div>
                <input type="checkbox" id="agree" value="필수 약관" required>
              </div>
              <br>
              <div class="label-box">
                <div class="required-box2">
                  <label for="agree" class="required1">개인정보처리방침</label>
                  <label for="agree" class="required2">(필수)</label>
                </div>
                <input type="checkbox" id="agree" vlaue="필수 약관" required>
              </div>
              <br>
              <div class="label-box">
                <div class="required-box3">
                  <label for="" class="required1">마케팅 수신동의</label>
                  <label for="" class="required2">(선택)</label>
                </div>
                <input type="checkbox" vlaue="선택 약관">
              </div>
            </div>
            <br><br><br>
            <button type="submit" id="submit-button" class="submit-button">회원가입 완료</button>
          </div>
        </form>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.6.4.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/join.js"></script>
</body>

</html>