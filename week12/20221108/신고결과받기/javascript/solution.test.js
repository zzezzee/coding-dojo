import solution from './solution';

const id_list = ["muzi", "frodo", "apeach", "neo"];
const report = ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"];
const k = 2;

test('solution', () => {
  expect(solution(id_list, report, k)).toEqual([2, 1, 1, 0]);
})
