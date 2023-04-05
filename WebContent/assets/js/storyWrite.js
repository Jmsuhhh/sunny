
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









