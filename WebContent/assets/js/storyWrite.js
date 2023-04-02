
let $fileInput = $('#file');
let $fileList = $(".file-list");
let $cnt = $('cnt');

console.log($fileInput);

$fileInput.on('change',function(){
	let files = this.files;
	console.log(files);

	if(files.length>1){
		let dt = new DataTransfer();
		alert("커버사진은 1개만 선택 가능합니다.")
		return;
	}
	
	for(let i=0; i<files.length; i++){
		let src = URL.createObjectURL(files[i]);
		
		$fileList.append(`
			<li>
				<div class="preview-img-box">
					<img src=${src}>
				</div>
				<div class="delete-button">
					<button type='button' class="delete-button" data-name="${files[i].name}">삭제</button>
				</div>
			</li>
		`);
	}
	
	$('.delete-button').on('click',function(){
		$(this).parent().parent().remove();
		let fileName = $(this).data('name');
		let dt = new DataTransfer();
		
		for(let i=0; i<files.length; i++){
			if(files[i].name !== fileName){
				dt.items.add(files[i]);
			}
		}
		files = dt.files;
	});
});

//취소 버튼 레츠기릿
$('.cancel-btn').on('click',()=>{
	window.location.href = '/story/storyListOk.st';
});


// 이미지 삽입 버튼 클릭 시 이벤트 핸들러
$('.note-toolbar .note-insert').click(function () {
  // 이미지 갯수 제한 설정 (예: 5개)
  var maxImages = 5;
  
  // 현재 이미지 갯수 계산
  var numImages = $('.note-editable img').length;
  
  // 이미지 갯수가 제한보다 적을 경우 이미지 삽입 허용
  if (numImages < maxImages) {
    // 이미지 삽입 로직
    // ...
  }
  // 이미지 갯수가 제한을 초과할 경우 경고 메시지 표시
  else {
    alert('이미지는 최대 ' + maxImages + '개까지 삽입할 수 있습니다.');
  }
});







