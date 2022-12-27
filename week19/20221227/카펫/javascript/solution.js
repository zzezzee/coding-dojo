function test() {
  console.log('solution(10, 2) : 4,3 = ' + solution(10, 2));
  console.log('solution(8, 1) : 3,3 = ' + solution(8, 1));
};

let vertical = 3;

function solution(brown, yellow) {
  const horizontal = (brown - (vertical * 2)) / 2 + 2;
  const expectedYellowSize = (vertical - 2) * (horizontal - 2);

  if (expectedYellowSize == yellow){
    return [horizontal, vertical];
  }

  vertical += 1;

  return solution(brown, yellow);
}

test();
