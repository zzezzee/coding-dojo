function solution(s) {
  const numbers = [
    "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine"
  ]

  var answer = numbers.reduce((acc, cur, index) => acc.replaceAll(cur, index), s)

  return Number(answer);
}