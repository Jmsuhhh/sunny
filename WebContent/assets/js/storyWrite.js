
//취소하기
$(".cancel-btn").on("click", () => {
  window.location.href = "#";
});

fileInput.addEventListener("change", (event) => {
  // 파일 선택 후 미리보기가 이미 존재하는 경우 삭제
  if (fileList.hasChildNodes()) {
    fileList.removeChild(fileList.childNodes[0]);
    counter.innerHTML = "0";
  }
  const files = fileInput.files;

  // 선택된 파일이 1개 이상일 경우
  if (files.length > 1) {
    alert("커버사진은 1개만 선택 가능합니다.");
    // 파일 선택 초기화
    fileInput.value = "";
    return;
  }

  const file = event.target.files[0];

  // 파일 타입이 이미지인 경우에만 미리보기 생성
  if (file && file.type.includes("image")) {
    const reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = () => {
      const img = document.createElement("img");
      img.src = reader.result;
      img.classList.add("preview-img");
      fileList.appendChild(img);
      counter.innerHTML = "1";

      // 삭제 버튼 추가
      const deleteButton = document.createElement("button");
      deleteButton.innerHTML = "삭제";
      deleteButton.classList.add("delete-button");
      img.parentNode.insertBefore(deleteButton, img.nextSibling);

      // 삭제 버튼 클릭 시 미리보기 이미지 삭제
      deleteButton.addEventListener("click", () => {
        fileList.removeChild(img);
        fileList.removeChild(deleteButton);
        counter.innerHTML = "0";
        fileInput.value = "";
      });
    };
  }
});
