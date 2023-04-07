/**
 * 
 */

let requiredBox = document.querySelector(".required-box");
let modalBox = document.querySelector(".modal-box");
let xBox = document.querySelector(".x-box");
let requiredBox2 = document.querySelector(".required-box2");
let modalBox2 = document.querySelector(".modal-box2");
let xBox2 = document.querySelector(".x-box2");
let requiredBox3 = document.querySelector(".required-box3");
let modalBox3 = document.querySelector(".modal-box3");
let xBox3 = document.querySelector(".x-box3");

requiredBox.addEventListener("click", function () {
  modalBox.style.display = "flex";
  $(modalBox).center();
  openModal();
});

xBox.addEventListener("click", function () {
  modalBox.style.display = "none";
  closeModal();
});

requiredBox2.addEventListener("click", function () {
  modalBox2.style.display = "flex";
  $(modalBox2).center();
  openModal();
});

xBox2.addEventListener("click", function () {
  modalBox2.style.display = "none";
  closeModal();
});

requiredBox3.addEventListener("click", function () {
  modalBox3.style.display = "flex";
  $(modalBox3).center();
  openModal();
});

xBox3.addEventListener("click", function () {
  modalBox3.style.display = "none";
  closeModal();
});

/*center 함수 재정의*/
jQuery.fn.center = function () {
	this.css('top', Math.max(0,(($(window).height()-$(this).outerHeight())/2) + $(window).scrollTop())+'px');
	this.css('left', Math.max(0,(($(window).width()-$(this).outerWidth())/2) + $(window).scrollLeft())+'px');
	return this;
}

// 스크롤 비활성화
const openModal = (e) => {
  document.body.style.overflow = "hidden";
};

// 스크롤 활성화
const closeModal = (e) => {
  document.body.style.overflow = "unset";
};


  const selectBox = document.getElementById('select');
  const submitBtn = document.querySelector('.submit-button');
  const form = document.querySelector('form');
  
  console.log('aaaaa');
  console.log(submitBtn);
  
  submitBtn.addEventListener('click', (event) => {
      event.preventDefault(); // 이벤트의 기본 동작(즉, submit)을 막음
    if (selectBox.value === '-1') {
      alert('비밀번호 찾기 질문을 선택해주세요.');
    } else {
    const form = document.querySelector('form');
    if (form.checkValidity()) {
      form.submit();
    } else {
      alert('폼에 유효하지 않은 값이 있습니다.');
    }
  }
  });




/**/



let $checkMsg = $("#check-id-msg");
let $checkPwMsg = $("#check-pw-msg");

let $idInput = $('#id');
let $pwInput = $("#password");

var test = '';

$idInput.on('blur', function(){
   if($(this).val() == '') {
      $checkMsg.text('아이디를 입력하세요!');
   } else {
      let id = $idInput.val();
   
   $.ajax({
      url : '/member/checkIdOk.me',
      type : 'get',
      data : {memberId : id},
      success : function(result) {
         $checkMsg.text(result);
         test = result;
      },
      error : function(a,b,c){
         console.log(c);
      }
      
   });
   }
});

//중복 검사를 위한 ajax
	$idInput.on('change', function() {
   let id = $idInput.val();
   
   $.ajax({
      url : '/user/checkIdOk.us',
      type : 'get',
      data : {userId : id},
      success : function(result) {
         $checkMsg.text(result);
         test = result;
      },
      error : function(a,b,c){
         console.log(c);
      }
      
   });
   
});


// 대소문자 상관 없이 영어가 포함, 숫자 포함, 특수문자 포함, 8글자 이상
const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;

$pwInput.on('blur', function(){
   if(regex.test(  $(this).val()   )){
      $checkPwMsg.text("사용 가능한 비밀번호입니다.");
   }else{
      $checkPwMsg.html("사용 불가능한 비밀번호입니다. <br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요!");
   }
});

$('form').on('submit', function(e){
	e.preventDefault();	// 기본 이벤트를 막아주는 명령어
	
	console.log($('#agree').prop('checked'));
	
	if($('#agree').prop('checked')){
		this.submit();	//서브밋 이벤트를 발생시키는 요소(폼 요소에 사용해야 함)
	}else{
		alert('약관에 동의해주세요!');
	}
});
