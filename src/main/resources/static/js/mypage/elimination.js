// 회원수정 모달창 띄우고 닫기
const modalTest = document.querySelector(".modal");
const btnOpenModalTest = document.querySelector(".btn_open_modal");
const closeTest = document.querySelector(".close");

btnOpenModalTest.addEventListener("click", () => {
  modalTest.style.display = "flex";
});

closeTest.addEventListener("click", () => {
  modalTest.style.display = "none";
});
