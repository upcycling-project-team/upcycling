document.addEventListener("DOMContentLoaded", function() {
    // 사용자 데이터 예시
    const userData = [
      { id: 1, name: "사용자1", points: 50 },
      { id: 2, name: "사용자2", points: 30 },
      { id: 3, name: "사용자3", points: 70 },
    ];
  
    const userTablesContainer = document.getElementById("userTables");
  
    // 테이블 생성 함수
    function createTable(user) {
      const table = document.createElement("table");
      table.innerHTML = `
        <thead>
          <tr>
            <th>ID</th>
            <th>이름</th>
            <th>포인트</th>
            <th>포인트 증가</th>
            <th>포인트 감소</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td><span class="points">${user.points}</span></td>
            <td><button onclick="increasePoints(${user.id})">증가</button></td>
            <td><button onclick="decreasePoints(${user.id})">감소</button></td>
          </tr>
        </tbody>
      `;
      userTablesContainer.appendChild(table);
    }
  
    // 초기 테이블 생성
    userData.forEach(createTable);
  
    // 포인트 증가 함수
    window.increasePoints = function(userId) {
      const user = userData.find(u => u.id === userId);
      if (user) {
        user.points += 10; // 증가할 포인트 값 (원하는 값으로 변경 가능)
        updatePointsDisplay(userId);
      }
    };
  
    // 포인트 감소 함수
    window.decreasePoints = function(userId) {
      const user = userData.find(u => u.id === userId);
      if (user && user.points >= 10) {
        user.points -= 10; // 감소할 포인트 값 (원하는 값으로 변경 가능)
        updatePointsDisplay(userId);
      } else {
        alert("포인트는 0 미만이 될 수 없습니다.");
      }
    };
  
    // 포인트 표시 업데이트 함수
    function updatePointsDisplay(userId) {
      const pointsElement = document.querySelector(`#userTables table:nth-child(${userId}) .points`);
      const user = userData.find(u => u.id === userId);
      if (pointsElement && user) {
        pointsElement.textContent = user.points;
      }
    }
  });
  