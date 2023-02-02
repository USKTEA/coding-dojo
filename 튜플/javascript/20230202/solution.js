export const parse = (strings) => {
  const splitted = strings.split('},{').map((string) => string.split(','));

  if (splitted.length === 1) {
    const first = splitted[0][0]
      .split('')
      .filter((letter) => letter !== '{' && letter !== '}')
      .join('') * 1;

    return [[first]];
  }

  const parsed = splitted.map((letters, index) => {
    if (index === 0) {
      const first = letters[0]
        .split('{')
        .join('') * 1;

      return [first, ...letters.slice(1, letters.length).map((letter) => letter * 1)];
    }

    if (index === splitted.length - 1) {
      const final = letters[letters.length - 1]
        .split('}')
        .join('') * 1;

      return [...letters.slice(0, letters.length - 1).map((letter) => letter * 1), final];
    }

    return letters.map((letter) => letter * 1);
  });

  return parsed;
};

export const sort = (arrays) => [...arrays].sort((a, b) => a.length - b.length);

export const toTuple = (arrays) => {
  const set = arrays.reduce((acc, array) => {
    array.forEach((element) => acc.add(element));

    return acc;
  }, new Set());

  return [...set.keys()];
};

export const solution = (strings) => toTuple(sort(parse(strings)));
