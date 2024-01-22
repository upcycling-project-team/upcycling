{
  let $prev = $('.slide__arrow-l');
  let $next = $('.slide__arrow-r');

  let $movingBox = $('.slide__moving-box');
  let width = 1240 / 2;
  let idx = 0;

  $prev.on('click', function () {
    if (idx === 0) return;

    idx--;
    $movingBox.css('left', `${-width * idx}px`);
  });

  $next.on('click', function () {
    if (idx === 2) return;

    idx++;
    $movingBox.css('left', `${-width * idx}px`);
    console.dir($('iframe')[0]);
  });
}
