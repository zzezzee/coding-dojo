// eslint-disable-next-line import/prefer-default-export
export function solution(n) {
  const answer = (i) => [...`${i}`].map(Number).reduce((acc, x) => acc + x);

  return answer(n);
}
