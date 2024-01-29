import { split, push, encrypt, isBlank } from './solution';

test('split', () => {
  expect(split('AB')).toEqual(['A', 'B']);
});

test('splitIncludeBlank', () => {
  expect(split('A B')).toEqual(['A', ' ', 'B']);
});

test('push', () => {
  expect(push('A', 1)).toBe('B');
});

test('pushBlank', () => {
  expect(push(' ', 1)).toBe(' ');
});

test('pushLowerCaseZ', () => {
  expect(push('z', 1)).toBe('a');
});

test('pushUpperCazeZ', () => {
  expect(push('Z', 1)).toBe('A');
});

test('encrypt', () => {
  expect(encrypt('AB', 1)).toBe('BC');
  expect(encrypt('z', 1)).toBe('a');
  expect(encrypt('a B z', 4)).toBe('e F d');
});

test('isBlank', () => {
  expect(isBlank(' ')).toBe(true);
  expect(isBlank('a')).toBe(false);
});
