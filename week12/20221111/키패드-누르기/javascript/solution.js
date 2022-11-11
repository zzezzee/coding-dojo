function test() {
  console.log(`solution([1, 4, 7, 3, 6, 9], right): 'LLLRRR' = '${solution([1, 4, 7, 3, 6, 9], 'right')}' `);

  console.log(`getDistance('*', 7) : 1 = ${getDistance('*', 7)}`);
  console.log(`getDistance('7', 2) : 3 = ${getDistance('7', 2)}`);

  console.log(`solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], right): 'LRLLLRLLRRL' = '${solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], 'right')}' `);
}

const solution = (numbers, hand) => {
  let answer = '';

  let leftHandPosition = '*';
  let rightHandPosition = '#';

  numbers.forEach(number => {   
    if (number === 1 || number === 4 || number === 7) {
      answer = answer + "L";
      leftHandPosition = number;
      return;
    }

    if (number === 3 || number === 6 || number === 9) {
      answer = answer + "R";
      rightHandPosition = number;
      return;
    }

    const leftHandDistance = getDistance(leftHandPosition, number);
    const rightHandDistance = getDistance(rightHandPosition, number);

    if (leftHandDistance === rightHandDistance) {
      if (hand === "right") {
        answer = answer + "R";
        rightHandPosition = number;
        return;
      }

      if (hand === 'left') {
        answer = answer + "L";
        leftHandPosition = number;
        return;
      }
    }

    if (leftHandDistance > rightHandDistance) {
      answer = answer + "R";
      rightHandPosition = number;
    } 

    if (leftHandDistance < rightHandDistance) {
      answer = answer + "L";
      leftHandPosition = number;
    }
  });

  return answer;
};

const getDistance = (locatedNumber, target) => {
  const keyPad = {
    1: [0, 0], 2: [0, 1], 3: [0, 2],
    4: [1, 0], 5: [1, 1], 6: [1, 2],
    7: [2, 0], 8: [2, 1], 9: [2, 2],
    '*': [3, 0], 0: [3, 1], '#': [3, 2],
  }

  const nowPosition = keyPad[locatedNumber];
  const targetPosition = keyPad[target];

  return Math.abs(targetPosition[0] - nowPosition[0]) + Math.abs(targetPosition[1] - nowPosition[1]);
};

test()
