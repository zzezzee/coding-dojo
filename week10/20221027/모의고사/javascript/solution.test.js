import { getSupojaArray, solution, collectAnswer, compare, findSmartSupoja } from './solution';

test('전체 테스트', () => {
  expect(solution([1, 2, 3, 4, 5])).toEqual([1])
})

test('supojaArray', () => {
  expect(getSupojaArray().length).toBe(3)
})
c
test('collectAnswer', () => {
  expect(collectAnswer(getSupojaArray(), [1, 2, 3, 4, 5]))
    .toEqual([5, 0, 0])
})

test('compare', () => {
  expect(compare([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]))
    .toBe(5)
})

test('smartSupoja', () => {
  expect(findSmartSupoja([5, 0, 0]))
    .toEqual([1])
})