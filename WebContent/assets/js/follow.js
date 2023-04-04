// 팔로워 팔로잉 리스트 top버튼

/*let userNumber = $(".follow-list>a").data("usernumber");
console.log(userNumber);*/

//리스트 띄운 회원의 userNumber확인
$(".follow-list").on('click', function(){
	console.log(this);
	console.log($(this).find("a").data("usernumber"));
	let userNumber = $(this).find("a").data("usernumber");
});


$(".top-btn").on("click", function () {
  // console.log(this);
  $(".top-btn").removeClass("active");
  $(this).toggleClass("active");
	
	console.log($(this).text());

	// 팔로잉리스트 버튼을 누르는 경우 비동기로 리스트 가져오기

	if($(this).text()=='팔로잉'){
			$.ajax({
			url: '/follow/followingList.fo',
			type: 'get',
			/*data: { userNumber : },//뭘 보내지?*/ 
			success: function() {
				console.log("로딩성공"); // 받아온 리스트를 뿌려야함
			},
			error: function(a, b, c) {
				console.log(c);
			}
		});
	}
	// 팔로워리스트 버튼을 누르는 경우 비동기로 리스트 가져오기
	

});

// 팔로우하기 버튼
$(".user-follow").on("click", function(){
  $(this).toggleClass("following");
  // console.log(this);
  if($(this).hasClass("following")===true){
    $(this).text("팔로잉");
// 비동기로 내 팔로잉테이블에 추가
  } else {
    $(this).text("팔로우");
// 비동기로 내 팔로잉테이블에서 삭제
  }
});

