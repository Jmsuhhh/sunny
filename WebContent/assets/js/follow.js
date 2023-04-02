// 팔로워 팔로잉 리스트 top버튼
$(".top-btn").on("click", function () {
  // console.log(this);
  $(".top-btn").removeClass("active");
  $(this).toggleClass("active");
});

// 팔로우하기 버튼
$(".user-follow").on("click", function(){
  $(this).toggleClass("following");
  // console.log(this);
  if($(this).hasClass("following")===true){
    $(this).text("팔로잉");
  } else {
    $(this).text("팔로우");
  }
});

