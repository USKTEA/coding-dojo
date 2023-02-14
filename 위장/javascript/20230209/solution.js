export const toMap = (clothes) => clothes.reduce((acc, cloth) => {
  const part = cloth[1];
  const name = cloth[0];

  if (acc.has(part)) {
    acc.set(part, [...acc.get(part), name]);

    return acc;
  }

  acc.set(part, [name]);

  return acc;
}, new Map());

export const getVariations = (clothes) => [...clothes.values()]
  .reduce((acc, part) => acc * (part.length + 1), 1) - 1;

export const solution = (clothes) => getVariations(toMap(clothes));
