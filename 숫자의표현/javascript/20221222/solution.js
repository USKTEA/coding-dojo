export const matcher = (start, current, acc, toMatch, result) => {
  if (start === Math.ceil(toMatch)) {
    return result + 1;
  }

  if (acc > toMatch) {
    return matcher(start + 1, start + 1, 0, toMatch, result);
  }

  if (acc === toMatch) {
    return matcher(start + 1, start + 1, 0, toMatch, result + 1);
  }

  return matcher(start, current + 1, acc + current, toMatch, result);
};

export const solution = (number) => matcher(1, 1, 0, number, 0);
