export const solution = (numbers) => (
  multiply(numbers.reduce((acc, number) => addDisjoint(
    { result1: acc, result2: factorize({ number }) },
  ), {})));

export const isPrime = (number) => {
  for (let i = 2; i <= Math.sqrt(number); i += 1) {
    if (number % i === 0 && number !== i) {
      return false;
    }
  }

  return true;
};

export const factorize = ({ number, divider = 2, factorizeResult = {} }) => {
  if (isPrime(number)) {
    if (Object.hasOwn(factorizeResult, number)) {
      factorizeResult[number] += 1;

      return factorizeResult;
    }

    factorizeResult[number] = 1;

    return factorizeResult;
  }

  if (number === 1 && Object.keys(factorizeResult).length === 0) {
    return { 1: 1 };
  }

  if (number === 1) {
    return factorizeResult;
  }

  if (number % divider !== 0) {
    return factorize({
      number, divider: divider + 1, factorizeResult,
    });
  }

  if (!Object.hasOwn(factorizeResult, divider)) {
    factorizeResult[divider] = 1;

    return factorize({ number: number / divider, divider, factorizeResult });
  }

  if (Object.hasOwn(factorizeResult, divider)) {
    factorizeResult[divider] += 1;
  }

  return factorize({ number: number / divider, divider, factorizeResult });
};

export const addDisjoint = ({ result1, result2 }) => (
  Object.keys(result2).reduce((acc, key) => {
    if (Object.hasOwn(acc, key) && acc[key] < result2[key]) {
      acc[key] = result2[key];

      return acc;
    }

    if (Object.hasOwn(acc, key) && acc[key] >= result2[key]) {
      return acc;
    }

    acc[key] = 1;

    return acc;
  }, result1));

export const multiply = (sumOfFactorized) => Object.entries(sumOfFactorized)
  .reduce((acc, [key, value]) => acc * key ** value, 1);
