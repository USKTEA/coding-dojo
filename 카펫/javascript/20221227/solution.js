export const solution = (brown, yellow, height = 3) => {
  const sum = brown + yellow;

  if (sum % height !== 0) {
    return solution(brown, yellow, height + 1);
  }

  const width = sum / height;

  if ((height - 2) * (width - 2) === yellow) {
    return [width, height];
  }

  return solution(brown, yellow, height + 1);
};
