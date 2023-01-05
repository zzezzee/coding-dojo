function test() {
  console.log('solution([70, 50, 80, 50], 100) : 3 = '
    + solution([70, 50, 80, 50], 100));
  console.log('solution([70, 80, 50], 100) : 3 = '
    + solution([70, 80, 50], 100));

}

function solution(people, limit) {
  test();
  let answer = 0;
  
  people.sort((a, b) => a - b);
  
  let heavy = people.length - 1;
  let light = 0;

  while (heavy >= light) {
    if (people[heavy] + people[light] <= limit){
      light += 1;
    }
      
    answer += 1;
    heavy -= 1;
  }
  
  return answer;
}
