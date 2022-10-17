import solution, { toArray, reverse } from './solution'

test('toArray', () => {
  expect(toArray(12345)).toEqual([1,2,3,4,5]);
});

test('reverse', () => {
  expect(reverse([1,2,3,4,5])).toEqual([5,4,3,2,1]);
});

test('solution', () => {
  expect(solution(12345)).toEqual([5,4,3,2,1]);
});
