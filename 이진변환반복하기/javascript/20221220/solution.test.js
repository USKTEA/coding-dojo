import { solution, countOnes, toBinary } from './solution';

test('solution', () => {
  expect(solution({ s: '01110' })).toEqual([3, 3]);
  expect(solution({ s: '110010101001' })).toEqual([3, 8]);
  expect(solution({ s: '1111111'	})).toEqual([4, 1]);
});

test('countOnes', () => {
  expect(countOnes('01110')).toBe(3);
});

test('toBinary', () => {
  expect(toBinary({ number: 3 })).toBe('11');
  expect(toBinary({ number: 6 })).toBe('110');
  expect(toBinary({ number: 7 })).toBe('111');
  expect(toBinary({ number: 1 })).toBe('1');
});
