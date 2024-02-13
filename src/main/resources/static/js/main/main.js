let width = 1884;
let idx = 0;
let length = document.querySelectorAll('.banner__item').length
let $bannerBox = document.querySelector('.banner__box');

{
    let $arrowL = document.querySelector('.banner__arrow-l');
    let $arrowR = document.querySelector('.banner__arrow-r');

    let interval = setInterval(function () {
        idx++;
        moveBanner();
    }, 3000);

    $arrowL.addEventListener('click', function () {
        if (idx == 0) return;
        idx--;
        moveBanner();
    });

    $arrowR.addEventListener('click', function () {
        if (idx == length - 1) return;
        idx++;
        moveBanner();
    });
}

function moveBanner() {
    $bannerBox.setAttribute('style', 'transition:1s all linear;');

    if (idx == length) {
        idx = 0;
        $bannerBox.setAttribute('style', 'transition:none;');
        $bannerBox.style.left = `${-idx * width}px`;
        return;
    }
    $bannerBox.style.left = `${-idx * width}px`;
}

{ // 스크롤 위치 변경
    // console.log(window.scrollY)

    // window.scrollTo(0, 1514);
    // history.scrollRestoration = "auto"

    window.addEventListener('DOMContentLoaded', function () {
        console.log("load")
        window.scrollTo(0, 1514);
    });
}











