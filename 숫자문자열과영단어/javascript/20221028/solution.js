const table = {
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  5: '5',
  6: '6',
  7: '7',
  8: '8',
  9: '9',
  one: '1',
  two: '2',
  three: '3',
  four: '4',
  five: '5',
  six: '6',
  seven: '7',
  eight: '8',
  nine: '9',
  zero: '0',
};

export const toArray = (string) => {
  return string.split('');
};

export const process = (words) => {
  return step({
    words,
    end: words.length,
    decrypting: '',
    current: 0,
    result: '',
  });
};

export const step = ({ words, end, decrypting, current, result }) => {
  if (current > end) {
    return parseInt(result, 10);
  }

  if (table[words]) {
    return step({
      words,
      end,
      decrypting,
      current: current + 1,
      result: result + table[words],
    });
  }

  if (table[decrypting]) {
    return step({
      words,
      end,
      decrypting: '',
      current,
      result: result + table[decrypting],
    });
  }

  return step({
    words,
    end,
    decrypting: decrypting + words[current],
    current: current + 1,
    result,
  });
};
