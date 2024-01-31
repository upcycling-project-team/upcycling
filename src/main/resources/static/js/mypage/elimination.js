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
    // userProfileName : $('#member-profile-name').val(),
    // userProfileUploadPath : $('#member-profile-upload-path').val(),
    // userProfileUuid : $('#member-profile-uuid').val(),
    userBirth : `${year}.${month}.${day}`
  };

  let form = new FormData();
  let keys = Object.keys(updateInfo);

  for(let key of keys){
    form.append(key, updateInfo[key]);
  }

  let file = document.querySelector('#file_01').files[0];
  form.append('profile', file);



  // console.log(updateInfo);

  $.ajax({
    url : '/users/update-info',
    type: 'patch',
    data : form,
    contentType : false,
    cache : false,
    processData: false,
    success : function () {
      modalTest.style.display = "none";
    },
    error : function (xhr, status, err) {
      console.log(err);
    }
  })
});





$('#file_01').on('change', function (){
  console.log('change!!!')

  let files = this.files;
  let src = URL.createObjectURL(files[0]);

  $('.img_box').attr('src', src);
});





