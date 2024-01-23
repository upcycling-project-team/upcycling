document.addEventListener("DOMContentLoaded", function() {
    // 예시로 몇 명의 회원을 추가합니다.
    const members = [
      { id: 1, name: "홍길동", email: "hong@example.com", price:"11,000",sale:"9,000" },
      { id: 2, name: "김철수", email: "kim@example.com", price:"13,000",sale:"11,000"  },
      // 추가적인 회원 정보를 필요에 따라 추가할 수 있습니다.
    ];
  
    const tableBody = document.querySelector("#memberTable tbody");
  
    // 회원 정보를 테이블에 추가하는 함수
    function renderMembers() {
      tableBody.innerHTML = ""; // 기존 행 삭제
  
      members.forEach(member => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td>${member.id}</td>
          <td>${member.name}</td>
          <td>${member.email}</td>
          <td>${member.price}</td>
          <td>${member.sale}</td>
          <td><button onclick="deleteMember(${member.id})">삭제</button></td>
        `;
        tableBody.appendChild(row);
      });
    }
  
    // 초기 회원 정보 표시
    renderMembers();
  
    // 회원 삭제 함수
    window.deleteMember = function(id) {
      const index = members.findIndex(member => member.id === id);
      if (index !== -1) {
        members.splice(index, 1);
        renderMembers(); // 테이블 업데이트
      }
    };
  });

  


  document.addEventListener("DOMContentLoaded", function() {
    // 예시로 몇 개의 지역별 배송비를 추가합니다.
    const shippingData = [
      { area: "서울", fee: 3000 },
      { area: "경기", fee: 5000 },
      { area: "부산", fee: 6000 },
      // 추가적인 배송비 정보를 필요에 따라 추가할 수 있습니다.
    ];
  
    const tableBody = document.querySelector("#shippingTable tbody");
  
    // 배송비 정보를 테이블에 추가하는 함수
    function renderShippingData() {
      tableBody.innerHTML = ""; // 기존 행 삭제
  
      shippingData.forEach(shipping => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td>${shipping.area}</td>
          <td>${shipping.fee}원</td>
          <td><button onclick="editShippingFee('${shipping.area}')">수정</button></td>
        `;
        tableBody.appendChild(row);
      });
    }
  
    // 초기 배송비 정보 표시
    renderShippingData();
  
    // 배송비 수정 함수
    window.editShippingFee = function(area) {
      const newFee = prompt(`새로운 ${area} 지역의 배송비를 입력하세요.`);
      
      if (newFee !== null) {
        const parsedFee = parseInt(newFee);
        if (!isNaN(parsedFee) && parsedFee >= 0) {
          const index = shippingData.findIndex(shipping => shipping.area === area);
          if (index !== -1) {
            shippingData[index].fee = parsedFee;
            renderShippingData(); // 테이블 업데이트
          } else {
            alert(`${area} 지역을 찾을 수 없습니다.`);
          }
        } else {
          alert("올바른 숫자를 입력하세요.");
        }
      }
    };
  });
  
  document.addEventListener("DOMContentLoaded", function() {
    // 예시로 몇 개의 리뷰를 추가합니다.
    const reviewData = [
      { id: 1, author: "사용자1", content: "좋은 제품입니다.", rating: 5 },
      { id: 2, author: "사용자2", content: "품질이 좋지 않아요.", rating: 2 },
      { id: 3, author: "사용자3", content: "만족합니다.", rating: 4 },
      // 추가적인 리뷰 정보를 필요에 따라 추가할 수 있습니다.
    ];
  
    const tableBody = document.querySelector("#reviewTable tbody");
  
    // 리뷰 정보를 테이블에 추가하는 함수
    function renderReviewData() {
      tableBody.innerHTML = ""; // 기존 행 삭제
  
      reviewData.forEach(review => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td>${review.id}</td>
          <td>${review.author}</td>
          <td>${review.content}</td>
          <td>${review.rating}</td>
          <td><button onclick="deleteReview(${review.id})">삭제</button></td>
        `;
        tableBody.appendChild(row);
      });
    }
  
    
    // 초기 리뷰 정보 표시
    renderReviewData();
  
    // 리뷰 삭제 함수
    window.deleteReview = function(id) {
      const index = reviewData.findIndex(review => review.id === id);
      if (index !== -1) {
        reviewData.splice(index, 1);
        renderReviewData(); // 테이블 업데이트
      }
    };
  });
  