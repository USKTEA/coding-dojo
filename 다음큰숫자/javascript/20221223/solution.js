export const countOne = (number) => (number.toString(2)
  .split('')
  .reduce((acc, current) => (current === "1" ? acc + 1 : acc), 0))


export const findNextBigger = (number) => {
  const toMatch = countOne(number);

  for (let i = number + 1; ; i += 1) {
    if (countOne(i) === toMatch) {

      return i;
    }
  }
}
