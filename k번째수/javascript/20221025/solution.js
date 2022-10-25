export const sliceSortAndPick = (command) => {
  const [sliceStart, sliceEnd, pick] = command;

  return (array) =>
    array
      .slice(sliceStart - 1, sliceEnd)
      .sort((a, b) => a - b)
      .at(pick - 1);
};

export const process = (array, commands) =>
  commands
    .map((command) => sliceSortAndPick(command))
    .reduce((results, curr) => [...results, curr(array)], []);
