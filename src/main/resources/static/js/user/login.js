$(".loginbox__clickr").on("click", function () {
  $(".login-modal").removeClass("none");
});

$(".box__close").on("click", function () {
  $(".login-modal").addClass("none");
});

$(".search-input4").hide();
$(".login-modal__tabpw").hide();

// modal radio 버튼
$("input[name='loginModalRadio']").change(function () {
  if ($("input[name='loginModalRadio']:checked").val() == "이메일찾기") {
    $(".search-input4").hide();
    $(".search-input2 ").show();
  } else if ($("input[name='loginModalRadio']:checked").val() == "핸드폰찾기") {
    $(".search-input4").show();
    $(".search-input2 ").hide();
  }
});

// 아이디 찾기
$(".tab_menu li").click(function () {
  $(this).css({
    "background-color": "#ffffff",
    color: "#64c8c8",
    "border-bottom": "none",
    "border-top": "1px solid #64c8c8",
    "border-left": "1px solid #64c8c8",
    "border-right": "1px solid #64c8c8",
  });
  $(" #userIdFind, #userPhoneNumberFind, .userresult-pw, #userIdFindPw, #userPhoneNumberFindPw").val('');
  $(".userresult-id").hide();

  $(this).siblings().css({
    "background-color": "#F3F3F3",
    color: "#b4b4b4",
    "border-bottom": "1px solid #64c8c8",
    "border-top": "1px solid #ddd",
    "border-left": "1px solid #ddd",
    "border-right": "1px solid #ddd",
  });
  $(" #userIdFind, #userPhoneNumberFind, .userresult-pw, #userIdFindPw, #userPhoneNumberFindPw").val('');
  $(".userresult-pw").hide();
});

$(".tab_box li:nth-child(1)").on("click", function () {
  $(".login-modal__tabpw").hide();
  $(".login-modal__tabbox").show();
});

$(".tab_box li:nth-child(2)").on("click", function () {
  $(".login-modal__tabpw").show();
  $(".login-modal__tabbox").hide();
});

// 아이디 로그인
$("#logoBtn").on("click", function () {
  let value = $("#userId").val();
  let value1 = $("#userPassword").val();

  if (value.length != 0 && value1.length != 0) {
    $("#logoBtn").submit();
  } else if (value.length == 0) {
    alert("아이디를 입력하세요");
  } else if (value1.length == 0) {
    alert("비밀번호를 입력하세요");
  }  else {
    alert("아이디와 비밀번호를 입력하세요");
  }
});



// 아이디 찾기 모델
$(function () {
  $(".userresult-id, .userresult-pw").hide();

  $('.changepw').on('click', function () {
    $(".userresult-pw, #userIdFindPw, #userPhoneNumberFindPw").hide().val('');
    $(".userresult-id, #userIdFind, #userPhoneNumberFind").show();
  });

  $('.changeid').on('click', function () {
    $(".userresult-pw, #userIdFindPw, #userPhoneNumberFindPw").hide().val('');
    $(".userresult-id, #userIdFind, #userPhoneNumberFind").show();
  });

  $('#userFindBtn').on('click', function () {
    let userIdLength = $('#userIdFind').val() ? $('#userIdFind').val().length : 0;
    let isPhoneFindChecked = $('#phoneFindRadio').prop('checked');
    let userPhoneNumberLength = isPhoneFindChecked
        ? $('#userPhoneNumberFind').val() ? $('#userPhoneNumberFind').val().length : 0
        : 0;

    if (isPhoneFindChecked) {
      $(".userresult-id").hide();
    }

    if (userIdLength > 0 || (isPhoneFindChecked && userPhoneNumberLength > 0)) {
      $(".userresult-id").show();
    } else {
      $(".userresult-id").hide();
    }
  });

  $('#phoneFindRadio').on('click', function () {
    $(".userresult-id").hide();
    $('#userPhoneNumberFind').val('');
  });

  $('#emailFindRadio').on('click', function () {
    $(".userresult-id").hide();

    $('#userIdFind').val('');
  });

  $('#userFindPwBtn').on('click', function () {
    let userIdPwLength = $('#userIdFindPw').val() ? $('#userIdFindPw').val().length : 0;

    if (userIdPwLength > 0) {
      $(".userresult-pw").show();
    } else {
      $(".userresult-pw").hide();
    }
  });

  $('#phoneFindRadioPw').on('click', function () {
    $(".userresult-pw").hide();
    $('#userPhoneNumberFindPw').val('');
  });

  $('#emailFindRadioPw').on('click', function () {
    $(".userresult-pw").hide();
    $('#userIdFindPw').val('');
  });
});



// 비밀번호 확인
$(function (){
  $("#userGrupPw").hide();
  $("#userGrupPw1").hide();

  $("#userRePassword1").keyup(function (){

    let pw1 = $("#userPassword").val();
    let pw2 = $("#userRePassword1").val();

    if(pw1 != "" || pw2 != ""){
      if(pw1 == pw2) {
        $("#userGrupPw").show();
        $("#userGrupPw1").hide();

        $("#userLoginBtn").removeAttr("disabled");
      } else {
        $("#userGrupPw").hide();
        $("#userGrupPw1").show();
        $("#userLoginBtn").attr("disabled", "disabled");
      }
    }
  });

});









// 회원가입
$("#userLoginBtn").on("click", function () {
  let value1 = $(".membership-grup #userId").val().length;
  let value2 = $(".membership-grup #userPassword").val().length;
  let value3 = $(".membership-grup #userEmail").val().length;
  let value4 = $(".membership-grup #userName").val().length;
  let value5 = $(".membership-grup #userPhoneNumber").val().length;
  let value6 = $(".membership-grup #userAddress").val().length;
  $("select option:selected").val();
  if (
      value1 != 0 &&
      value2 != 0 &&
      value3 != 0 &&
      value4 != 0 &&
      value5 != 0 &&
      value6 != 0
  ) {
    $("#userJoinForm").submit();
  } else if (value1 == 0) {
    alert("아이디를 입력하세요");
  } else if (value2 == 0) {
    alert("비밀번호를 입력하세요");
  } else if (value3 == 0) {
    alert("이메일를 입력하세요");
  } else if (value4 == 0) {
    alert("이름을 입력하세요");
  } else if (value5 == 0) {
    alert("연락처를 입력하세요");
  } else if (value6 == 0) {
    alert("주소를 입력하세요");
  }
});





// 아이디 중복 확인
function checkUserId() {
  let userId = $("#userId").val();

  $.ajax({
    url: '/users/membership',
    data: {userId: userId},
    type: 'get',
    success: function (result) {
      console.log(result);

      if (result === "Duplicate") {
        $("#userGrupId").text("이미 사용 중인 아이디입니다.");
      } else {
        $("#userGrupId").text("사용 가능한 아이디입니다.");
      }
    },
    error: function (error) {
      $("#userGrupId").text("오류오류오류오루");
    }
  });
}




// clause
$("#checkAll").on("click", function () {
  if ($("#checkAll").is(":checked")) {
    $("input[name=clauseCheckbox]").prop("checked", true);
  } else {
    $("input[name=clauseCheckbox]").prop("checked", false);
  }
});

// 가입하기
$("#clauseButton").on("click", function () {
  if (
      $("#checkAll").is(":checked") &&
      $("#check1").is(":checked") &&
      $("#check2").is(":checked") &&
      $("#check3").is(":checked")
  ) {
    window.location.href = '/user/membership';
  } else {
    alert("약관 동의를 해주세요");
  }
});

//about
$(function () {
  $(".about-top h1").animate({top: "30%", opacity: "1"}, 1000, function () {
    $(".about-top div").animate({left: "23%", opacity: "1"}, 700);
  });
});

$(function () {
  $(window).scroll(function () {
    sc = $(window).scrollTop();

    if (sc > 70) {
      $(".about-middle h2").animate({opacity: "1"}, 500, function () {
        $(".about-middle p").stop().animate({opacity: "1"}, 500);
      });
    }

    if (sc > 170) {
      $(".about-left h2").animate(
          {left: "40%", opacity: "1"},
          800,
          function () {
            $(".about-left p").stop().animate({left: "40%", opacity: "1"}, 800);
          }
      );
    }

    if (sc > 230) {
      $(".about-right1 div:nth-child(1)").animate(
          {right: "30%", opacity: "1"},
          1000,
          function () {
            $(".about-right1 div:nth-child(2)")
                .stop()
                .animate({right: "30%", opacity: "1"}, 1000, function () {
                  $(".about-right1 div:nth-child(3)")
                      .stop()
                      .animate({right: "30%", opacity: "1"}, 1000);
                });
          }
      );
    }
  });
});

// 회원수정 창 달력
$(function () {
  let now = new Date();
  let year = now.getFullYear();
  let mon =
      now.getMonth() + 1 > 9
          ? "" + (now.getMonth() + 1)
          : "0" + (now.getMonth() + 1);
  let day = now.getDate() > 9 ? "" + now.getDate() : "0" + now.getDate();
  //년도 selectbox만들기
  for (let i = 1900; i <= year; i++) {
    $("#userBirthYear").append(
        '<option value="' + i + '">' + i + "년</option>"
    );
  }

  // 월별 selectbox 만들기
  for (let i = 1; i <= 12; i++) {
    let mm = i > 9 ? i : "0" + i;
    $("#userBirthMonth").append(
        '<option value="' + mm + '">' + mm + "월</option>"
    );
  }

  // 일별 selectbox 만들기
  for (let i = 1; i <= 31; i++) {
    let dd = i > 9 ? i : "0" + i;
    $("#userBirthDay").append(
        '<option value="' + dd + '">' + dd + "일</option>"
    );
  }
  $("#userBirthYear  > option[value=" + year + "]").attr("selected", "true");
  $("#userBirthMonth  > option[value=" + mon + "]").attr("selected", "true");
  $("#userBirthDay  > option[value=" + day + "]").attr("selected", "true");
});


// 이미지 파일
$('#userProFile').on('change', function () {
  console.log('change!!!')

  let files = this.files;
  let src = URL.createObjectURL(files[0]);

  $('.userprofilefile').attr('src', src);
});









