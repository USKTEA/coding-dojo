import {
  factorize, addDisjoint, multiply, solution, isPrime,
} from './solution';

test('factorize', () => {
  expect(factorize({ number: 2 })).toEqual({ 2: 1 });
  expect(factorize({ number: 13 })).toEqual({ 13: 1 });
  expect(factorize({ number: 34 })).toEqual({ 2: 1, 17: 1 });
  expect(factorize({ number: 1 })).toEqual({ 1: 1 });
  expect(factorize({ number: 5 })).toEqual({ 5: 1 });
  expect(factorize({ number: 9 })).toEqual({ 3: 2 });
  expect(factorize({ number: 14 })).toEqual({ 2: 1, 7: 1 });
  expect(factorize({ number: 20 })).toEqual({ 2: 2, 5: 1 });
});

test('Add disjoint', () => {
  expect(addDisjoint(
    { result1: { 2: 1 }, result2: { 3: 1 } },
  )).toEqual({ 2: 1, 3: 1 });

  expect(addDisjoint(
    { result1: { 2: 1, 3: 3 }, result2: { 3: 1 } },
  )).toEqual({ 2: 1, 3: 3 });
});

test('multiply', () => {
  expect(multiply({ 2: 1, 3: 2 })).toBe(18);
});

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
  expect(solution([12, 32, 45, 67, 72])).toBe(96480);
  expect(solution([1, 3, 5, 7, 11])).toBe(1155);
  expect(solution([14, 2, 7])).toBe(14);
});

test('isPrime', () => {
  expect(isPrime(7)).toBe(true);
  expect(isPrime(29)).toBe(true);
});
