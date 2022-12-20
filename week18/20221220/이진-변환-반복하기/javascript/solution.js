function test() {
  console.log('solution("110010101001") : 3,8 = '
    + solution("110010101001"));
}

let zeroCount = 0;;
let totalCycle = 0;

function solution(s) {
  if (s === '1') {
    return [totalCycle, zeroCount];
  }

  totalCycle += 1;

  const oneCount = s.split('')
    .filter((element) => element === '1')
    .length;
  
  zeroCount += s.length - oneCount;

  const reducedString = oneCount.toString(2);

  return solution(reducedString)
}
