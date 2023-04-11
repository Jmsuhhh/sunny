let $fileInput = $('#file');
let $fileList = $('.file-list');
let $cnt = $('.cnt');

// 서머노트
$(document).ready(function () {
  $("#summernote").summernote({
    height: 500,
    lang: "ko-KR",
    toolbar: [
      ["style", ["style"]],
      ["font", ["bold", "italic", "underline", "clear"]],
      ["fontname", ["fontname"]],
      ["color", ["color"]],
      ["para", ["ul", "ol", "paragraph"]],
    ],
    placeholder:
      "<br><br>* 양식에 맞춰서 작성해주세요 ! <br>양식에 맞지 않을시 거절 될 수 있습니다. <br><br><br> 필수작성사항 <br> 1) 식고수신청계기 : <br> 2) 식물에 대해 가지고 있는 지식 정도 : 첨부파일로 첨부가능 <br> 3) 식고수 신청 후 활동계획 : ",
  });
});

// 파일첨부부분

$fileInput.on('change', function(){
  let files = this.files;
  console.log(files);
  
  // 파일을 변경하면 원래 선택된 파일은 미리보기를 제거한다.
  $fileList.html('');   

  //5개를 넘기면 초기화 처리
  if(files.length > 3){
    let dt = new DataTransfer();
    files = dt.files;
     //console.log(files);
    alert("파일은 최대 3개 까지만 첨부 가능합니다.")
    $cnt.text(files.length);
    return;
  }
  
  for(let i=0; i<files.length; i++){
    let src = URL.createObjectURL(files[i]);
    
    $fileList.append(`
        <li>
          <div class="show-img-box">
            <img src=${src}>
          </div>
          <div class="btn-box">
            <button type='button' class='img-cancel-btn' data-name='${files[i].name}'>삭제</button>
          </div>
        </li>
    `);
  }
  
  $cnt.text(files.length);
  
  
  $('.img-cancel-btn').on('click', function() {
    console.log("클릭!!!!");
    
     // 버튼의 부모의 부모를 삭제
    $(this).parent().parent().remove();
    
    /*console.log($fileInput);
    console.log("======")
    console.log($fileInput[0].files);*/
    
    let fileName = $(this).data('name');
    let dt = new DataTransfer();
    
    for(let i=0; i<files.length; i++){
        if(files[i].name !== fileName)   {
          dt.items.add(files[i]);
        }
    }
    
    files = dt.files;
    
    console.log(files);
    $cnt.text(files.length);
  });
});


// 등록버튼
$(".submit-btn-btn").on("click", () => {
  window.location.href = "#";
});

// 취소버튼 마이페이지로 이동처리 해야함.
$(".cancel-btn").on("click", () => {
  window.location.href = "#";
});


