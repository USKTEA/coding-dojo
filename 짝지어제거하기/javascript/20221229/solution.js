import Stack from './Stack';

const solution = (string) => {
  const remains = string.split('')
    .reduce(
      (stack, letter) => stack.add(letter),
      new Stack(),
    );

  return remains.length() ? 0 : 1;
};

export default solution;
