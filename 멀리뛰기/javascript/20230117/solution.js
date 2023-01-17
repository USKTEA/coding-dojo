export const fibonacci = (n) => {
  const array = Array.from({ length: n + 1 }, (_, index) => 0)
    .reduce((acc, number, index) => {
      if (index === 0) {
        return acc;
      }

      if (index === 1) {
        acc[index] = 1;

        return acc;
      }

      if (index === 2) {
        acc[index] = 2;

        return acc;
      }

      acc[index] = (acc[index - 1] + acc[index - 2]) % 1234567;

      return acc;
    }, []);

  return array[n];
};
