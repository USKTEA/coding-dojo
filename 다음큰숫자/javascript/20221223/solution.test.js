import {countOne, findNextBigger} from './solution';

test('countOne', () => {
  expect(countOne(78)).toBe(4);
})

test('nextBiggerNumber', () => {
  expect(findNextBigger(78)).toBe(83);
})
