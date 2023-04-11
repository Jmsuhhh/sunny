/**
 * 
 */
 
 $(document).ready(function() {
  $('#change-button').click(function() {
    var userId = $('#userId').val();
    var password = $('#password').val();
    var rePassword = $('.change-button').val();
    
    $.ajax({
      type: 'POST',
      url: '/find/findPwOk.fp',
      data: {userId: userId, password: password, rePassword: rePassword},
      success: function(data) {
        if (data == 'success') {
          alert('비밀번호가 변경되었습니다.');
          location.href = '/user/login.us';
        } else {
          alert('비밀번호 변경에 실패하였습니다. 입력값을 확인해주세요.');
        }
      },
      error: function() {
        alert('서버와의 통신에 실패하였습니다.');
      }
    });
  });
});