
// 식집사/식고수 gradeNumber에 따라 텍스트 바꿔주기
console.log(gradeNumber);

function showGrade(gradeNumber){
	let text ='';
	if(gradeNumber==500){
		text +='식고수'
	}else{
		text +='식집사'
	}
	$('.grade').text(text);
	console.log(text);
};
showGrade();


// 회원등급모달창
$(".grade-info").on("click", function() {
	console.log(this);

	$(".grade-modal-box").toggleClass("none")
});
$(".grade-x-box").on("click", function() {
	$(".grade-modal-box").toggleClass("none");
});

// 프로필사진등록
$(".profile-photo-btn").on("click", function() {
	$(".photo-modal-box").toggleClass("none");
});
$(".photo-x-box").on("click", function() {
	$(".photo-modal-box").toggleClass("none");
});

let $fileInput = $('#profile-file');
let $profilePhoto = $('.profile-photo>img');
let $profileForm = $('.profile-photo-form');

$fileInput.on('change', function() {
	console.log(this);
	let userFile = this.files[0];
	console.log(userFile);

	let src = URL.createObjectURL(userFile);
	console.log($profilePhoto);

	$profilePhoto.attr("src", src);
	$(".photo-modal-box").toggleClass("none");

	// 비동기로 사진 넣는거 끝남 이제 DB에 저장해야함
	let form = $profileForm[0];
	console.log(form);
	let data = new FormData(form);

	$.ajax({
		url: '/userFile/userFileOk.uf',
		type: 'post',
		data: data,
		processData: false,
		contentType: false,
		success: function() {
			console.log("저장성공");

		},
		error: function(a, b, c) {
			console.log(c);
		}
	})

});

// 프로필을 기본사진으로 변경 

$(".basic-photo").on("click", function() {
	let srcB = '/assets/img/myPage/logo.png';
	$profilePhoto.attr("src", srcB);
	$(".photo-modal-box").toggleClass("none");
	
	//원래있던프로필사진 지우기
	$.ajax({
		url: '/userFile/userFileDelete.uf',
			type: 'get',
			success: function() {
				console.log("삭제성공");
			},
			error: function(a, b, c) {
				console.log(c);
			}
	});
});


// 한줄소개편집 input박스띄우기
$(".modify-btn-ready").on("click", function() {
	$(".profile-content-wrap").hide();
	$(".modify-box-wrap").show();
});

// 한줄소개 저장
$(".profile-introduce").on("click", ".modify-btn-done", function() {
	let $parent = $(this).closest(".profile-introduce");
	let $children = $parent.find(".profile-content");
	let $content = $children.children();
	// $content=p태그

	let modifyContent = $(this).prev().val(); //사용자가 작성한 한줄소개글내용
	console.log(modifyContent);
	// 한줄코멘트 저장하는 Ajax
	function commentAjax() {
		$.ajax({
			url: '/user/userCommentOk.us',
			type: 'get',
			data: { userComment: modifyContent },
			success: function() {
				console.log("저장성공");
			},
			error: function(a, b, c) {
				console.log(c);
			}
		})
	};

	if (modifyContent == '') {
		$content.text("한 줄 소개글을 작성해주세요");
		modifyContent = "한 줄 소개글을 작성해주세요";
		commentAjax();
	} else {
		$content.text(modifyContent);
		commentAjax();
	}
	$(".modify-box-wrap").hide();
	$(".profile-content-wrap").show();
});


// ***식고수의마이페이지
// 답변대기/답변완료 버튼 눌렀을 때
// 리스트 비동기로 띄우기

$(".answer-btn").on("click", function() {
	// console.log(this);
	$(".answer-btn").removeClass("active");
	$(this).toggleClass("active");
});
