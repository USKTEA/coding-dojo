export const indices = (word) => word.split('').reduce((acc, current, index) => {
  if (current === '(') {
    acc.open.push(index);
  }

  if (current === ')') {
    acc.close.push(index);
  }

  return acc;
}, { open: [], close: [] });

export const validate = ({ open, close }) => {
  if (open.length !== close.length) {
    return false;
  }

  return !open.find((element, index) => element > close[index]);
};

export const solution = (s) => validate(indices(s));
