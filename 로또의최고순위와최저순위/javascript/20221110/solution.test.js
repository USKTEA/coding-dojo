import {
  getScoreAndMagicNumber,
  countScore,
  getRanking,
  highestAndLowestRanking,
  solution,
} from './solution';

test('count score and 0 numbers', () => {
  expect(
    getScoreAndMagicNumber([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]),
  ).toEqual([2, 2]);
});

test('count highest and lowest score', () => {
  expect(countScore(2, 2)).toEqual([4, 2]);
});

test('getRanking', () => {
  expect(getRanking[6]).toBe(1);
});

test('get highest and lowest ranking', () => {
  expect(highestAndLowestRanking(4, 2)).toEqual([3, 5]);
});

test('solution', () => {
  expect(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])).toEqual([
    3, 5,
  ]);
});
