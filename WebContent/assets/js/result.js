
    // 3초 후에 result.jsp로 이동하는 함수
    function moveToResult() {
        setTimeout(function () {
            location.href = "/algorithm/result.ag";
        }, 1000); // 3초 후에 result.jsp로 이동
    }

/*    // 로딩 중인 이미지를 보여주는 함수
    function showLoading() {
        var loadingDiv = document.getElementById("loading");
        loadingDiv.style.display = "block";
    }*/

    // 페이지가 로드될 때 실행되는 함수
    window.onload = function () {
       /* showLoading();*/ // 로딩 중인 이미지를 보여줌
        moveToResult(); // 3초 후에 result.jsp로 이동
    }
