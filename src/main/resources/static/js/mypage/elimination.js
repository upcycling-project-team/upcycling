// 회원수정 모달창 띄우고 닫기
const modalTest = document.querySelector(".modal");
const btnOpenModalTest = document.querySelector(".btn_open_modal");
const closeTest = document.querySelector(".close");

btnOpenModalTest.addEventListener("click", () => {
  modalTest.style.display = "flex";

  $.ajax({
    url: `/users/update-info`,
    type : 'get',
    dataType : 'json',
    success : function (userDto){
      $('.member_id').val(userDto.userId);
    },
    error : function (xhr, status, err){
      console.log(err);
    }
  });
});

closeTest.addEventListener("click", () => {
  modalTest.style.display = "none";
});


$('.btn_modify').on('click', function (e) {
  e.preventDefault(); // submit 이벤트를 막기위해 사용
  let year = $('#year').val();
  let month = $('#month').val();
  let day = $('#day').val();

  let updateInfo = {
    userPassword : $('#member-pw').val(),
    userEmail : $('#member-email').val(),
    userName : $('#member-name').val(),
    userPhoneNumber : $('#member-phone').val(),
    userAddress : $('#member-address').val(),
    userAddressDetail : $('#member-address-detail').val(),
    userBirth : `${year}.${month}.${day}`
  };

  // console.log(updateInfo);

  $.ajax({
    url : '/users/update-info',
    type: 'patch',
    data : JSON.stringify(updateInfo),
    contentType : 'application/json',
    success : function () {
      modalTest.style.display = "none";
    },
    error : function (xhr, status, err) {
      console.log(err);
    }
  })
});











