/**
 * 
 */
 
 // js로 req객체에 직접 접근하는 것은 불가능하다.
 // 그러나 브라우저 주소창에 있는 쿼리스트링을 가져와 쓸 수 있다.
 // window -> 브라우저
 // location -> 주소창
 console.log(window.location.search)
 
 let queryString = location.search;
 
 let urlParams = new URLSearchParams(queryString);
 
 let login = urlParams.get('login');
 
 if(login == 'fail'){
 	alert('아이디/패스워드가 일치하지 않습니다.');
} 	

