export const toJaden = ({ current, previous }) => (
  previous === ' '
    ? String(current).toUpperCase()
    : String(current).toLowerCase()
);

export const solution = (s) => (
  s.split('')
    .reduce((acc, current, index) => (
      index === 0
        ? current.toUpperCase()
        : acc + toJaden({
          current,
          previous: s[index - 1],
        })), ''));
