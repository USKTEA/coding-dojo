const checkIsDuplicated = (words, index, current) => words.slice(0, index).indexOf(current);

const checkIsEqual = (previous, current) => previous[previous.length - 1] === current[0];

export const solution = (n, words) => {
  let answer = 0;

  words.reduce((prev, current, index) => {
    answer = answer
    || ((checkIsDuplicated(words, index, current) !== -1 || checkIsEqual(prev, current))
      ? index : answer);

    return current;
  }, '');

  return answer ? [answer % n + 1, Math.floor(answer / n) + 1] : [0, 0];
};

export default solution;
