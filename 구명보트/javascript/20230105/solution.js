export const sort = (people) => people.sort((a, b) => {
  if (a < b) {
    return 1;
  }

  if (a > b) {
    return -1;
  }

  return 0;
});

export const onBoard = (people, limit) => {
  let first = 0;
  let second = first + 1;
  let count = 0;

  while (first !== people.length) {
    if (first === second) {
      second += 1;

      continue;
    }

    if (second === people.length - 1 && people[first] + people[second] > limit) {
      people[first] = 0;

      first += 1;
      second = first + 1;
      count += 1;

      continue;
    }

    if (people[first] === 0) {
      first += 1;

      continue;
    }

    if (people[second] === 0) {
      second += 1;

      continue;
    }

    if (limit - people[first] < 40 || second === people.length) {
      people[first] = 0;

      first += 1;
      second = first + 1;
      count += 1;

      continue;
    }

    if (people[first] + people[second] <= limit) {
      people[first] = 0;
      people[second] = 0;

      first += 1;
      second = first + 1;
      count += 1;

      continue;
    }

    second += 1;
  }

  return count;
};

export const solution = (people, limit) => onBoard(sort(people), limit);
