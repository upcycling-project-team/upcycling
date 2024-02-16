let communityNumber = $('#communityNumber').val();

getList();

function getList() {
    $.ajax({
        url: '/replies',
        type: 'get',
        data: {communityNumber: communityNumber},
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
}