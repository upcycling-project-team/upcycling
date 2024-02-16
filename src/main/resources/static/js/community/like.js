
// 좋아요 구현=======================================================================================
$('.admin__img__likeButton').on('click',function() {
    let data = {
        communityNumber : $(this).data('num')
    }


    $.ajax({
        url : "/likes",
        type : 'Post',
        contentType: 'application/json',
        data : JSON.stringify(data),
        success : function(count){
            let imgPath = '';

            if(count == 1){
                console.log("좋아요 성공");
                imgPath = '/images/news/fullHeart.png';
            }else {
                console.log("좋아요 삭제");
                imgPath = '/images/news/binHeart.png';
            }

            $('.admin__img__like').attr('src', imgPath);

        }, error : function(result){
            console.log("에러" + result.result)
        }

    });
});

