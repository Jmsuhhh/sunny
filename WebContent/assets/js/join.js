/**
 * 
 */

let requiredBox = document.querySelector(".required-box");
let modalBox = document.querySelector(".modal-box");
let xBox = document.querySelector(".x-box");
let requiredBox2 = document.querySelector(".required-box2");
let modalBox2 = document.querySelector(".modal-box2");
let xBox2 = document.querySelector(".x-box2");
let requiredBox3 = document.querySelector(".required-box3");
let modalBox3 = document.querySelector(".modal-box3");
let xBox3 = document.querySelector(".x-box3");

requiredBox.addEventListener("click", function () {
  modalBox.style.display = "flex";
  $(modalBox).center();
  openModal();
});

xBox.addEventListener("click", function () {
  modalBox.style.display = "none";
  closeModal();
});

requiredBox2.addEventListener("click", function () {
  modalBox2.style.display = "flex";
  $(modalBox2).center();
  openModal();
});

xBox2.addEventListener("click", function () {
  modalBox2.style.display = "none";
  closeModal();
});

requiredBox3.addEventListener("click", function () {
  modalBox3.style.display = "flex";
  $(modalBox3).center();
  openModal();
});

xBox3.addEventListener("click", function () {
  modalBox3.style.display = "none";
  closeModal();
});

/*center 함수 재정의*/
jQuery.fn.center = function () {
	this.css('top', Math.max(0,(($(window).height()-$(this).outerHeight())/2) + $(window).scrollTop())+'px');
	this.css('left', Math.max(0,(($(window).width()-$(this).outerWidth())/2) + $(window).scrollLeft())+'px');
	return this;
}

// 스크롤 비활성화
const openModal = (e) => {
  document.body.style.overflow = "hidden";
};

// 스크롤 활성화
const closeModal = (e) => {
  document.body.style.overflow = "unset";
};
