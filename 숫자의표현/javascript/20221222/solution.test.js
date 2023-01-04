import { matcher, solution } from './solution';

test('match', () => {
  expect(matcher(1, 1, 0, 15, 0)).toBe(4);
});

test('solution', () => {
  expect(solution(15)).toBe(4);
});
