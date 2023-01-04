import { solution } from './solution';

test('solution', () => {
  expect(solution(10, 2)).toEqual([4, 3]);
  expect(solution(24, 24)).toEqual([8, 6]);
  expect(solution(8, 1)).toEqual([3, 3]);
});
