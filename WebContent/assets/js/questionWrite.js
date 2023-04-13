
let $fileInput = $('#file');
let $fileList = $(".file-list");
let $cnt = $('cnt');

console.log($fileInput);

$fileInput.on('change', function() {
   let files = this.files;
   console.log(files);

   if (files.length > 1) {
      let dt = new DataTransfer();
      alert("커버사진은 1개만 선택 가능합니다.")
      return;
   }

   for (let i = 0; i < files.length; i++) {
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

   $('.delete-button').on('click', function() {
      $(this).parent().parent().remove();
      let fileName = $(this).data('name');
      let dt = new DataTransfer();

      for (let i = 0; i < files.length; i++) {
         if (files[i].name !== fileName) {
            dt.items.add(files[i]);
         }
      }
      files = dt.files;
   });
});

let $fileInput2 = $('#file2');
let $fileList2 = $(".file-list2");
let $cnt2 = $('cnt2');

console.log($fileInput2);

$fileInput2.on('change', function() {
   let files = this.files;
   console.log(files);

   if (files.length > 1) {
      let dt = new DataTransfer();
      alert("내용사진은 1개씩만 첨부 가능합니다.")
      return;
   }

   for (let i = 0; i < files.length; i++) {
      let src = URL.createObjectURL(files[i]);

      $fileList2.append(`
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

   $('.delete-button').on('click', function() {
      $(this).parent().parent().remove();
      let fileName = $(this).data('name');
      let dt = new DataTransfer();

      for (let i = 0; i < files.length; i++) {
         if (files[i].name !== fileName) {
            dt.items.add(files[i]);
         }
      }
      files = dt.files;
   });
});


//작성 취소 
$('.cancel-btn').on('click', () => {
   window.location.href = '/gosu/searchOk.gu';
});

$(document).ready(function() {
  $("#summernote").summernote({
    height: 250,
    lang: "ko-KR",
    toolbar: [
      ["style", ["style"]],
      ["font", ["bold", "italic", "underline", "clear"]],
      ["fontname", ["fontname"]],
      ["color", ["color"]],
      ["para", ["ul", "ol", "paragraph"]],
    ],
    placeholder: "*스토리 내용을 입력해주세요!",
  });
});
