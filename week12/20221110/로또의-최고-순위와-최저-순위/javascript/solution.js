function test() {
  console.log(`collectCount([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]): 2 
  = ${getCollectCount([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])}`);

  console.log(`zeroCount([44, 1, 0, 0, 31, 25]): 2 
  = ${getZeroCount([44, 1, 0, 0, 31, 25])}`);

  console.log(`ranking(2, 2): [3, 5] = ${ranking(2, 2)}`);
}

function solution(lottos, win_nums) {
  const collectCount = getCollectCount(lottos, win_nums);
  const zeroCount = getZeroCount(lottos)
  const answer = ranking(collectCount, zeroCount)

  return answer;
}

function getCollectCount(lottos, win_nums) {
  return lottos.filter(number => win_nums.includes(number)).length;
}

function getZeroCount(lottos) {
  return lottos.filter(number => number === 0).length
}

function ranking(collectCount, zeroCount) {
  const highestCount = collectCount + zeroCount;
  const lowestCount = collectCount;

  const counts = [highestCount, lowestCount];

  return counts.map(count => {
    switch (count) {
      case 6: return 1;
      case 5: return 2;
      case 4: return 3;
      case 3: return 4;
      case 2: return 5;
      default: return 6;
    }
  });
}

// test();
