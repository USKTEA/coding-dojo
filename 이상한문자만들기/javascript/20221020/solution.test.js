import { split, upperOdd } from './solution';

test('split', () => {
  expect(split('try hello world')).toEqual(['try', 'hello', 'world']);
});

test('weirdWord', () => {
  expect(upperOdd(['try', 'hello', 'word'])).toEqual('TrY HeLlO WoRlD');
});
