import { indices, validate, solution } from './solution';

test('indices', () => {
  expect(indices('()()')).toEqual({ open: [0, 2], close: [1, 3] });
});

test('validate', () => {
  expect(validate({ open: [0, 2], close: [1, 3] })).toBeTruthy();
  expect(validate({ open: [0, 1, 3], close: [2] })).toBeFalsy();
  expect(validate({ open: [1, 3], close: [0, 2] })).toBeFalsy();
});

test('solution', () => {
  expect(solution('()()')).toBeTruthy();
  expect(solution(')()(')).toBeFalsy();
  expect(solution('(()(')).toBeFalsy();
});
