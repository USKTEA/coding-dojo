const pipe = (...processes) => (initialValue) => processes.reduce((result, process) => process(result), initialValue);

export const solution = (student, lost, reserve) => pipe(
  originStatus,
  reflectReserve(reserve),
  reflectLost(lost),
  borrowFromBackAndForth,
  countHaveClothMoreThanOne,
)(student);

export const originStatus = (studentCounts) => Array
  .from({ length: studentCounts }, (_, index) => index + 1)
  .reduce((map, number) => map.set(number, 1), new Map());

export const reflectReserve = (reserves) => (status) => {
  const copy = new Map();

  status.forEach((value, key) => (reserves.includes(key)
    ? copy.set(key, value + 1)
    : copy.set(key, value)));

  return copy;
};

export const reflectLost = (lost) => (status) => {
  const copy = new Map();

  status.forEach((value, key) => (lost.includes(key)
    ? copy.set(key, value - 1)
    : copy.set(key, value)));

  return copy;
};

export const borrowFromBackAndForth = (status) => {
  const copy = new Map();

  status.forEach((value, key) => {
    copy.set(key, value);
  });

  copy.forEach((value, key) => {
    if (value === 0) {
      if (copy.has(key - 1) && copy.get(key - 1) > 1) {
        copy.set(key - 1, copy.get(key - 1) - 1);
        copy.set(key, 1);

        return;
      }

      if (copy.has(key + 1) && copy.get(key + 1) > 1) {
        copy.set(key + 1, copy.get(key + 1) - 1);
        copy.set(key, 1);
      }
    }
  });

  return copy;
};

export const countHaveClothMoreThanOne = (status) => {
  const studentCanTakeLesson = new Map();

  status.forEach((value, key) => {
    if (value >= 1) {
      studentCanTakeLesson.set(key, value);
    }
  });

  return studentCanTakeLesson.size;
};
