export const solution = (parenthesis) => {
  const opening = openings(parenthesis);
  const closing = closings(parenthesis);

  if (!hasEqualLength(opening, closing)) {
    return false;
  }

  if (filter(opening, closing).length !== opening.length) {
    return false;
  }

  return true;
};

export const openings = (parenthesis) => {
  return parenthesis.split('').reduce((acc, crr, index) => {
    if (crr === '(') {
      acc.push(index);
    }

    return acc;
  }, []);
};

export const closings = (parenthesis) => {
  return parenthesis.split('').reduce((acc, crr, index) => {
    if (crr === ')') {
      acc.push(index);
    }

    return acc;
  }, []);
};

export const hasEqualLength = (array1, array2) => {
  return array1.length === array2.length;
};

export const filter = (array1, array2) => {
  const array = array1.filter((ele, index) => ele < array2[index]);

  return array;
};
