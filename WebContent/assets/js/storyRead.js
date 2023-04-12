function toggleFollow(button) {
  if (button.innerHTML === "팔로우") {
    button.innerHTML = "팔로잉";
    button.classList.toggle("following", true);
    button.classList.toggle("follow", false);
  } else {
    button.innerHTML = "팔로우";
    button.classList.toggle("following", false);
    button.classList.toggle("follow", true);
  }
}

let $listBtn = $('.list-btn');
let $modifyBtn = $('.modify-btn');
let $deleteBtn = $('.delete-btn');

let storyNumber = $listBtn.data("storynumber");

console.log(storyNumber);

$listBtn.on('click', () =>{
	window.location.href = '/story/storyListOk.st';
});

$modifyBtn.on('click', () =>{
	window.location.href = '/story/storyUpdate.st?storyNumber='+storyNumber;
});

$deleteBtn.on('click', () =>{
	window.location.href = '/story/storyDeleteOk.st?storyNumber='+storyNumber;
});


$.ajax({
	url : '/storyReply/storyReplyListOk.sr',
	type : 'get',
	data : {storyNumber : storyNumber},
	dataType : "json",
	success : function(replies){
		console.log(replies);
	}
});

console.log('----------------------------');



