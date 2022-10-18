export const solution = (number) => [...`${number}`]
  .map(Number)
  .reduce((total, current) => total + current);
