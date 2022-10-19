import solution from './solution';

// test('toIntArray', () => {
//   expect(toIntArray(118372)).toEqual([1, 1, 8, 3, 7, 2]);
// });

// test('toReveredOrder', () => {
//   expect(toReversedOrder([1, 1, 8, 3, 7, 2])).toEqual([8, 7, 3, 2, 1, 1]);
// });

// test('join', () => {
//   expect(joining([8, 7, 3, 2, 1, 1])).toBe(873211);
// });

test('solution', () => {
  expect(solution(118372)).toBe(873211);
});
