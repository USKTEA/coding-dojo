const pipe = (...processes) => (
  (initialValue, win_nums) => (
    processes
      .reduce((result, process) => process(...result), [initialValue, win_nums])));

export const getScoreAndMagicNumber = (lottos, win_nums) => lottos.reduce(
  (acc, number) => {
    if (win_nums.includes(number)) {
      return [acc[0] + 1, acc[1]];
    }

    if (number === 0) {
      return [acc[0], acc[1] + 1];
    }

    return acc;
  },
  [0, 0],
);

export const countScore = (minimum, magicNumber) => [minimum + magicNumber, minimum];

export const ranking = {
  6: 1,
  5: 2,
  4: 3,
  3: 4,
  2: 5,
};

export const highestAndLowestRanking = (highest, lowest) => [
  ranking[highest] || 6,
  ranking[lowest] || 6,
];

export const solution = (lottos, win_nums) => pipe(
  getScoreAndMagicNumber,
  countScore,
  highestAndLowestRanking,
)(lottos, win_nums);
