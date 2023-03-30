/**
 * 
 */

// 목록
function questionList(e){
    window.location.href="/question/questionList.qs";
}

// 수정
$(".modify-btn").on('click', () => {
   window.location.href = '#' + boardNumber;
});

// 삭제
$(".delete-btn").on('click', () => {
   window.location.href = '#' + boardNumber;
});


// 댓글 
replyAjax();

function replyAjax(){
   $.ajax({
      url : '/reply/replyListOk.re',
      type : 'get',
      data : {boardNumber : boardNumber},
      dataType : 'json',
      success : showReply
   });
}


function showReply(replies){
   let text = '';
   
   replies.forEach(reply => {
      text += `
            <ul id="comment-list">
                  <li>
                     <div class="comment-info">
                        <span class="writer">${reply.memberId}</span> <span
                           class="date">${reply.replyDate}</span>
                     </div>
                     <div class="comment-content-wrap">
                        <div class="comment-content">
                           <p>${reply.replyContent}</p>
                        </div>`
                        
         if(memberNumber == reply.memberNumber){               
         text +=    `<div class="comment-btn-group">
                           <button type=button class="comment-modify-ready">수정</button>
                           <button type=button class="comment-delete" data-number="${reply.replyNumber}">삭제</button>
                        </div>
                        <div class="comment-btn-group none">
                           <button type=button class="comment-modify" data-number="${reply.replyNumber}">수정 완료</button>
                        </div>`
                        
         }         
         
         text+=   `</div>
                  </li>
            </ul>
      `;
   });
   
   $('.comment-list').html(text);
}


//댓글 작성
$('.submit-btn').on('click', function() {
   $.ajax({
      url : '/reply/replyWriteOk.re',
      type : 'post',
      data : {
         boardNumber : boardNumber,
         memberNumber : memberNumber,
         replyContent : $('#content').val()
      },
      success : function(){
         replyAjax();
         $('#content').val('');
      }
   });
});

$('.comment-list').on('click', '.comment-delete', function(){
   let replyNumber = $(this).data('number');
   
   $.ajax({
      url : "/reply/replyDeleteOk.re",
      type : "get",
      data : {replyNumber : replyNumber},
      success : function(){
         replyAjax();
      }
   });
});

$('.comment-list').on('click','.comment-modify-ready', function(){
	

	let $parent = $(this).closest('#comment-list');

	let $children = $parent.find('.comment-btn-group');

	$children.eq(0).hide();
	$children.eq(1).show();
	
	let $content = $(this).parent().prev().children();
	console.log($content);
	
	$content.replaceWith(`<textarea class='modify-content'> ${$content.text()} </textarea>`);
});

$('.comment-list').on('click', '.comment-modify', function(){
	let replyNumber = $(this).data('number');
	
	$.ajax({
		url : '/reply/replyUpdateOk.re',
		type : 'get',
		data : {
			replyNumber : replyNumber,
			replyContent : $('.modify-content').val()
		},
		success : function(){
			replyAjax();
		}
	});
});




















