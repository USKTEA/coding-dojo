import {
  openings,
  closings,
  hasEqualLength,
  filter,
  solution,
} from './solution';

test('openingsParenthesis', () => {
  expect(openings('()()')).toEqual([0, 2]);
});

test('closingParenthesis', () => {
  expect(closings('()()')).toEqual([1, 3]);
});

test('hasEqualLength', () => {
  expect(hasEqualLength([0, 2], [1, 3])).toBe(true);
});

test('filterFromZeroIndex', () => {
  expect(filter([0, 2], [1, 3])).toEqual([0, 2]);
});

test('solution', () => {
  expect(solution('()()')).toBe(true);
  expect(solution('(())()')).toBe(true);
  expect(solution('(()(')).toBe(false);
  expect(solution(')()(')).toBe(false);
});
