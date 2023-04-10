  // 사용자가 선택한 값을 저장하기 위한 객체
  /*const answers = {};

  function saveAnswer(questionNumber, answer) {
    // 사용자가 선택한 값을 객체에 저장
    answers[`question${questionNumber}`] = answer;
  }

  function showResult() {
    // 사용자가 선택한 값을 바탕으로 결과 계산
    let plantName = "name";
    let plantContent = "content";

    if (answers.question1 && !answers.question2 && answers.question3 && !answers.question4 && !answers.question5) {
      plantName = "극락조";
      plantContent = "이국적 분위기를 연상케 하는 극락조는 인테리어 식물로 인기가 많아요. 병충해도 적어서 초보자들도 키우기 쉽답니다.극락조 중 잎이 큰 친구는 여인초 라고 불려요. 여인초는 꽃이 안핀답니다. 직사광선을 받으면 잎 끝이 탈 수 있어요. 밝은 곳이나 반음지에서 키우는걸 추천합니다. 👍 극락조는 뿌리가 굵은 식물이에요. 뿌리가 물을 많이 저장할 수 있어서 화분의 흙이 빠삭하게 말랐을 때 물 주는게 좋아요";
    } else if (answers.question1 && answers.question2 && answers.question3 && !answers.question4 && !answers.question5) {
      plantName = "자미오쿨카스";
      plantContent = "돈이 들어오는 나무 라는 뜻을 가진 금전수는 돈나무로도 불리고 있어요. 이름 덕분에 개업식, 집들이용으로 인기만점이랍니다! 👍선물용으로 인기 많은 이유는 키우기 쉽기 때문이기도 해요. 어느정도의 빛이 있으면 어디에서도 잘 자라요.";
    } else if (answers.question1 && answers.question2 && answers.question3 && answers.question4 && answers.question5) {
      plantName = "식물 C";
      plantContent = "식물 C에 대한 설명입니다.";
    } else {
      plantName = "결과 없음";
      plantContent = "해당하는 식물이 없습니다.";
    }

    // 결과를 표시하는 HTML 생성
    const resultHtml = `
      <h2>추천 식물: ${plantName}</h2>
      <p>${plantContent}</p>
    `;

    // 결과를 현재 페이지에 표시
    const resultContainer = document.getElementById("result-container");
    resultContainer.innerHTML = resultHtml;
  }*/
const plants = {
  '00000': { name: '식물1', content: '식물1 정보' },
  '00001': { name: '식물2', content: '식물2 정보' },
  '00010': { name: '식물3', content: '식물3 정보' },
  // 중간 생략
  '11111': { name: '식물32', content: '식물32 정보' }
};

// 선택된 답변 문자열을 0과 1로 변환하여, plants 객체에서 해당하는 식물 정보를 가져옵니다.
const selectedPlant = plants[Object.values(result).join('')];

// 선택된 식물 정보 출력
console.log(selectedPlant.name);
console.log(selectedPlant.content);