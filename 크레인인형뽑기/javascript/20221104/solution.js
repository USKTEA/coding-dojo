export const toMap = (board) => {
  const borderLength = board.length;

  const map = board.flat().reduce((acc, number, index) => {
    if (number === 0) {
      return acc;
    }

    if (acc.has(index % borderLength + 1)) {
      acc.set(index % borderLength + 1, [number, ...acc.get(index % borderLength + 1)]);

      return acc;
    }

    acc.set(index % borderLength + 1, [number]);

    return acc;
  }, new Map());

  return map;
};

export const pickedDoll = (board, moves) => {
  const stack = [];

  return moves.reduce((acc, move) => {
    if (board.get(move).length === 0) {
      return acc;
    }

    stack.push(board.get(move).pop());

    if (stack.length >= 2) {
      if (stack[stack.length - 1] === stack[stack.length - 2]) {
        stack.pop();
        stack.pop();

        return acc + 2;
      }
    }

    return acc;
  }, 0);
};

export const solution = (board, moves) => pickedDoll(toMap(board), moves);
