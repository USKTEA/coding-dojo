import { sort, onBoard, solution } from './solution';

test('sort', () => {
  expect(sort([70, 50, 80, 50])).toEqual([80, 70, 50, 50]);
});

test('onBoard', () => {
  expect(onBoard([80, 70, 50, 50], 100)).toBe(3);
  expect(onBoard([70, 80, 50])).toBe(3);
});

test('solution', () => {
  expect(solution([70, 50, 80, 50], 100)).toBe(3);
  expect(solution([70, 50, 80, 50, 90, 40], 240)).toBe(3);
});
