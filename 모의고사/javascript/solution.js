const patterns = [
  [1, 2, 3, 4, 5],
  [2, 1, 2, 3, 2, 4, 2, 5],
  [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
];

export const grading = (answers, patterns) =>
  patterns.map((pattern) =>
    answers.map((answer, index) =>
      answer === pattern[index % pattern.length] ? 1 : 0,
    ),
  );

export const sum = (scores) =>
  scores.map((score) => score.reduce((acc, cur) => acc + cur));

export const pickHighest = (scores) =>
  scores.reduce(
    (acc, cur, index) =>
      cur === Math.max(...scores) ? [...acc, index + 1] : acc,
    [],
  );

export const pipe =
  (...processes) =>
  (answer) =>
    processes.reduce(
      (result, process, index) =>
        index === 0 ? process(result, patterns) : process(result),
      answer,
    );
