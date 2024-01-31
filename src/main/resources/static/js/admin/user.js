document.addEventListener("DOMContentLoaded", function() {
  // 예시로 몇 개의 주문을 추가합니다.
  const orderData = [
    {id: 1, memberId: "user1", product: "상품A", quantity: 2, amount: 30000, date: "2022-01-20 10:30", status: "배송준비"},
    {id: 2, memberId: "user2", product: "상품B", quantity: 1, amount: 25000, date: "2022-01-21 12:45", status: "배송중"},
    {id: 3, memberId: "user3", product: "상품C", quantity: 3, amount: 45000, date: "2022-01-22 15:20", status: "배송완료"},
    // 추가적인 주문 정보를 필요에 따라 추가할 수 있습니다.
  ];

  
  //   const tableBody = document.querySelector("#orderTable tbody");
  //
  //   // 주문 정보를 테이블에 추가하는 함수
  //   function renderOrderData() {
  //     tableBody.innerHTML = ""; // 기존 행 삭제
  //
  //     orderData.forEach(order => {
  //       const row = document.createElement("tr");
  //       row.innerHTML = `
  //         <td>${order.id}</td>
  //         <td>${order.memberId}</td>
  //         <td>${order.product}</td>
  //         <td>${order.quantity}</td>
  //         <td>${order.amount}원</td>
  //         <td>${order.date}</td>
  //         <td>${order.status}</td>
  //       `;
  //       tableBody.appendChild(row);
  //     });
  //   }
  //
  //   // 초기 주문 정보 표시
  //   renderOrderData();
   });



  document.addEventListener("DOMContentLoaded", function() {
    // 예시로 몇 개의 주문을 추가합니다.
    const orderData = [
      { id: 1, memberId: "user1", product: "상품A", quantity: 2, amount: 30000, date: "2022-01-20 10:30", status: "배송준비" },
      { id: 2, memberId: "user2", product: "상품B", quantity: 1, amount: 25000, date: "2022-01-21 12:45", status: "배송중" },
      { id: 3, memberId: "user3", product: "상품C", quantity: 3, amount: 45000, date: "2022-01-22 15:20", status: "배송완료" },
      // 추가적인 주문 정보를 필요에 따라 추가할 수 있습니다.
    ];
    //
    // const tableBody = document.querySelector("#deliveryTable tbody");
    //
    // // 주문 정보를 테이블에 추가하는 함수
    // function renderOrderData() {
    //   tableBody.innerHTML = ""; // 기존 행 삭제
    //
    //   orderData.forEach(order => {
    //     const row = document.createElement("tr");
    //     row.innerHTML = `
    //       <td>${order.id}</td>
    //       <td>${order.memberId}</td>
    //       <td>${order.product}</td>
    //       <td>${order.quantity}</td>
    //       <td>${order.amount}원</td>
    //       <td>${order.date}</td>
    //       <td>${order.status}</td>
    //       <td><button onclick="updateDeliveryStatus(${order.id})">상태 업데이트</button></td>
    //     `;
    //     tableBody.appendChild(row);
    //   });
    // }
    //
    // 초기 주문 정보 표시
    // renderOrderData();
  
    // 배송 상태 업데이트 함수
  //   window.updateDeliveryStatus = function(id) {
  //     const order = orderData.find(order => order.id === id);
  //     if (order) {
  //       const newStatus = prompt(`새로운 ${id}번 주문의 배송 상태를 입력하세요.`);
  //       if (newStatus !== null) {
  //         order.status = newStatus;
  //         renderOrderData(); // 테이블 업데이트
  //       }
  //     }
  //   };
});
  