import { solution } from './solution';

test('solution', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toBe(5);
  expect(solution(3, [3], [1])).toBe(2);
})