export const countOnes = (number) => Array
  .from({ length: number.length }, (_, index) => index)
  .reduce((acc, _, index) => (number[index] === '1' ? acc + 1 : acc), 0);

export const toBinary = ({ number, remains, calculated }) => {
  if (number < 2 && !calculated) {
    return `${number}`;
  }

  if (number < 2) {
    return `${number}${remains}`;
  }

  const remain = number % 2;

  if (remains === undefined) {
    return toBinary({
      number: Math.floor(number / 2),
      remains: remain,
      calculated: true,
    });
  }

  return toBinary({
    number: Math.floor(number / 2),
    remains: `${remain}${remains}`,
    calculated: true,
  });
};

export const solution = ({ s, answer = [0, 0] }) => {
  if (s === '1') {
    return answer;
  }

  answer[1] += s.length - countOnes(s);
  answer[0] += 1;

  return solution({
    s: toBinary({ number: countOnes(s) }),
    answer,
  });
};
