/**
 * 
 */
 
 /*비밀번호 일치 여부 검사*/
// inputPw 값이 변경될 때마다 실행
$('.inputPw').on('keyup', function () {
  var password = $('input[name=newPassword]').val(); // 비밀번호 값
  var passwordConfirm = $(this).val(); // 비밀번호 확인 값
  var errorSpan = $(this).siblings('.password-error'); // 오류 메시지 span

  if (password !== passwordConfirm) {
    errorSpan.text('두 비밀번호가 일치하지 않습니다.');
  } else {
    errorSpan.text('');
  }
});


/*비밀번호 정규표현식*/
 let $checkPwMsg = $("#check-pw-msg");
 let $pwInput = $("#newPassword");
 
 // 대소문자 상관 없이 영어가 포함, 숫자 포함, 특수문자 포함, 8글자 이상
const regex4 = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;

$pwInput.on('blur', function(){
   if(regex4.test(  $(this).val()   )){
      $checkPwMsg.text("사용 가능한 비밀번호입니다.");
   }else{
      $checkPwMsg.html("사용 불가능한 비밀번호입니다. <br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요!");
   }
});

/*ajax1*/
$(function() {
    $('#find-pw-form').submit(function(event) {
        event.preventDefault(); // 폼의 기본 동작을 막음
        $.ajax({
            type: 'POST',
            url: '/find/findPwOk.fp', // 비밀번호 찾기 컨트롤러 경로
            data: $(this).serialize(),
            success: function(data) {
                if (data === 'SUCCESS') {
                    // 비밀번호 재설정 폼 표시
                    $('#user-number').val(data.userNumber);
                    $('#reset-pw-form').show();
                } else {
                    alert(data);
                }
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(textStatus + ': ' + errorThrown);
            }
        });
    });

    $('#reset-password-btn').click(function() {
        var userNumber = $('#user-number').val(); // 비밀번호 찾기 컨트롤러에서 전달된 유저 번호
        var newPassword = $('#new-password').val();

        $.ajax({
            type: 'POST',
            url: '/find/resetPwOk.fp', // 비밀번호 재설정 컨트롤러 경로
            data: { userNumber: userNumber, newPassword: newPassword },
            success: function(data) {
                if (data === 'SUCCESS') {
                    alert('비밀번호가 성공적으로 재설정되었습니다.');
                    // 비밀번호 재설정 폼 숨기기
                    $('#reset-pw-form').hide();
                } else {
                    alert(data);
                }
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(textStatus + ': ' + errorThrown);
            }
        });
    });
});

 
 /*ajax처리*/
 
 $(document).ready(function() {
  $('#confirm-button').on('click', function() {
    var userId = $('#userId').val();
    var findQuestionNumber = $('#select').val();
    var findPasswordAnswer = $('input[name=findPasswordAnswer]').val();
    var newPassword = $('input[name=newPassword]').val();

    $.ajax({
      url: '${pageContext.request.contextPath}/find/findPw.fp',
      type: 'POST',
      data: {
        userId: userId,
        findQuestionNumber: findQuestionNumber,
        findPasswordAnswer: findPasswordAnswer
      },
      success: function(result) {
        if (result === 'success') {
          alert('일치합니다. 비밀번호를 재설정해주세요.');
          $('#change-button').on('click', function() {
            $.ajax({
              url: '${pageContext.request.contextPath}/find/findPw.fp',
              type: 'POST',
              data: {
                userId: userId,
                newPassword: newPassword
              },
              success: function(result) {
                if (result === 'success') {
                  alert('비밀번호가 변경되었습니다.');
                  window.location.href = '${pageContext.request.contextPath}/user/login.us';
                } else {
                  alert('비밀번호 변경에 실패하였습니다.');
                }
              },
              error: function() {
                alert('비밀번호 변경에 실패하였습니다.');
              }
            });
          });
        } else {
          alert('일치하지 않습니다. 다시 입력해주세요.');
        }
      },
      error: function() {
        alert('비밀번호 찾기 질문 확인에 실패하였습니다.');
      }
    });
  });
});