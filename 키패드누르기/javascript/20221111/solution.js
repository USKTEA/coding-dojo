export const zeroToEleven = (numbers) => [...numbers]
  .map((number) => (number === 0 ? 11 : number));

export const distance = ((fingerPosition, number) => (
  Math.floor(Math.abs(fingerPosition - number) / 3)
     + (Math.abs(fingerPosition - number) % 3)));

export const type = (number, {
  left, right, prior, result,
}) => {
  if (number === 1 || number === 4 || number === 7) {
    return {
      left: number, right, prior, result: [...result, 'L'],
    };
  }

  if (number === 3 || number === 6 || number === 9) {
    return {
      left, right: number, prior, result: [...result, 'R'],
    };
  }

  const distanceFromLeftHand = distance(left, number);
  const distanceFromRightHand = distance(right, number);

  if (distanceFromLeftHand > distanceFromRightHand) {
    return {
      left, right: number, prior, result: [...result, 'R'],
    };
  }

  if (distanceFromLeftHand < distanceFromRightHand) {
    return {
      left: number, right, prior, result: [...result, 'L'],
    };
  }

  if (distanceFromLeftHand === distanceFromRightHand && prior === 'left') {
    return {
      left: number, right, prior, result: [...result, 'L'],
    };
  }

  return {
    left, right: number, prior, result: [...result, 'R'],
  };
};

export const solution = (numbers, hand) => {
  const initialState = {
    left: 10, right: 12, prior: hand, result: [],
  };

  const changed = zeroToEleven(numbers);

  const afterTyping = changed
    .reduce((state, number) => type(number, state), initialState);

  return afterTyping.result.join('');
};
