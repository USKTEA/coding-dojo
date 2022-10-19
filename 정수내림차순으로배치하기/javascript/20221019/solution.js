// export const toIntArray = (number) => {
//   return number
//     .toString()
//     .split('')
//     .map((string) => +string);
// };

// export const toReversedOrder = (numbers) => {
//   return numbers.sort((a, b) => b - a);
// };

// export const joining = (numbers) => {
//   return Number(numbers.reduce((a, b) => a + b, ''));
// };

const solution = (number) => {
  return (
    (number + '')
      .split('')
      .sort((a, b) => b - a)
      .join('') * 1
  );
};

export default solution;
