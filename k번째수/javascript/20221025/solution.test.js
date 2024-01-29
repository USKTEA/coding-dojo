import { sliceSortAndPick, process } from './solution';

test('sliceSortAndPick', () => {
  expect(sliceSortAndPick([2, 5, 3])([1, 5, 2, 6, 3, 7, 4])).toBe(5);
});

test('process', () => {
  expect(
    process(
      [1, 5, 2, 6, 3, 7, 4],
      [
        [2, 5, 3],
        [4, 4, 1],
        [1, 7, 3],
      ],
    ),
  ).toEqual([5, 6, 3]);
});
