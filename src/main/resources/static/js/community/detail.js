import * as reply from './community/reply.js';
let communityNumber = $('#communityNumber').val();
// let next = true;

getList();
{   // 리플 처리
    let communityNumber = $('.community-number').val();
    let page = 1;

    getList(communityNumber, page, displayReplies);

function getList() {
    $.ajax({
        url: '/replies',
        type: 'get',
        data: {communityNumber : communityNumber},
        success: function (list) {
            console.log(list)
            displayReplies(list)
        }
    });
}


function displayReplies(list){
    let html = '';

    list.forEach(reply => {
        html += `
         <li class="reply-list__reply">
                <div class="reply-list__img">
                    <img src="/images/news/userIcon.png" class="reply-list__icon" alt="">
                </div>
                <div class="reply-list_box">
                    <div class="reply-list__writer">${reply.userId}</div>
                     <div class="reply-list__content">${reply.communityReplyContent}</div>
                </div>
        </li>
        `;
    });
    $('.reply-list').html(html);
}};
// // 댓글 작성
// $('.btn-reply').on('click', function () {
//
//     console.log('123')
//     let content = $('#reply-content').val();
//
//     if(!content){
//         alert("내용을 입력해야 작성이되는거란다.")
//         return;
//     }
//
//     let replyObj = {
//         replyContent : content,
//         communityNumber : communityNumber
//     };
//
//     reply.register(replyObj, () => {
//         page = 1;
//         next = true;
//         getList(communityNumber, page, displayReplies);
//         $('#reply-content').val('');
//     });
// })};