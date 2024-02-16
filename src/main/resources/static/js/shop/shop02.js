$('.radio1').on('change', function (){
    $('.quality-box').removeClass('active');

    $(this).closest('label').addClass('active');
});

// 수량 증감
function count(type)  {
    // 결과를 표시할 element
    const resultElement = document.getElementById('result');

    // 현재 화면에 표시된 값
    let number = resultElement.innerText;


    // 더하기/빼기
    if(type === 'plus') {
        number = parseInt(number) + 1;
    }else if(type === 'minus')  {
        if(number <= 1) return;
        number = parseInt(number) - 1;
    }

    let $totalPrice = document.querySelector('#total-price');
    let price = document.querySelector('#productPrice').innerText;

    let totalPrice = parseInt(price) * number;

    $totalPrice.innerText = totalPrice;

    // 결과 출력
    resultElement.innerText = number;

}
