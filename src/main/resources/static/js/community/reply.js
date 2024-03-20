// // 함수로 분리할수 있는거 모든 모듈가능!
// export function register(reply, callback) {
//     console.log(reply)
//     $.ajax({
//         url: '/replies',
//         type: 'post',
//         data: JSON.stringify(reply),     // 보낼 데이터를 JSON형태로 변환한다.
//         contentType: 'application/json; charset=utf-8', // 보낼 데이터의 형식을 알려준다.
//         success: function () {
//             if (callback) {
//                 callback();
//             }
//         },
//         error: function (xhr, status, arr) {
//             consol
// }e.log(err);
// }
// });