import expect from 'expect';
import {
  grading, sum, pickHighest, pipe,
} from './solution';

test('grading', () => {
  expect(
    grading(
      [1, 2, 3, 4, 5],
      [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
      ],
    ),
  ).toEqual([
    [1, 1, 1, 1, 1],
    [0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0],
  ]);
  expect(
    grading(
      [1, 3, 2, 4, 2],
      [
        [1, 2, 3, 4, 5],
        [2, 1, 2, 3, 2, 4, 2, 5],
        [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
      ],
    ),
  ).toEqual([
    [1, 0, 0, 1, 0],
    [0, 0, 1, 0, 1],
    [0, 1, 0, 0, 1],
  ]);
});

test('sum', () => {
  expect(
    sum([
      [1, 1, 1, 1, 1],
      [0, 0, 0, 0, 0],
      [0, 0, 0, 0, 0],
    ]),
  ).toEqual([5, 0, 0]);
  expect(
    sum([
      [1, 0, 0, 1, 0],
      [0, 0, 1, 0, 1],
      [0, 1, 0, 0, 1],
    ]),
  ).toEqual([2, 2, 2]);
});

test('pickHighest', () => {
  expect(pickHighest([5, 0, 0])).toEqual([1]);
  expect(pickHighest([2, 2, 2])).toEqual([1, 2, 3]);
});

test('pipe', () => {
  expect(pipe(grading, sum, pickHighest)([1, 2, 3, 4, 5])).toEqual([1]);
  expect(pipe(grading, sum, pickHighest)([1, 3, 2, 4, 2])).toEqual([1, 2, 3]);
  expect(pipe(grading, sum, pickHighest)([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5])).toEqual([1]);
  expect(pipe(grading, sum, pickHighest)([2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5])).toEqual([2]);
  expect(pipe(grading, sum, pickHighest)([3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5])).toEqual([3]);
  expect(pipe(grading, sum, pickHighest)([2, 3, 4, 5, 1])).toEqual([2, 3]);
  expect(pipe(grading, sum, pickHighest)([1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5])).toEqual([1]);
});
