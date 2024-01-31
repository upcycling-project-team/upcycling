$('.radio1').on('change', function (){
    $('.quality-box').removeClass('active');

    $(this).closest('label').addClass('active');
});