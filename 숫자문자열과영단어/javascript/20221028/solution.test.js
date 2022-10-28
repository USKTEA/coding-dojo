import { toArray, process, step } from './solution';

test('toArray', () => {
  expect(toArray('one')).toEqual(['o', 'n', 'e']);
});

test('process', () => {
  expect(process(['o', 'n', 'e'])).toBe(1);
});

test('step', () => {
  expect(
    step({
      words: ['o', 'n', 'e'],
      end: 3,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(1);
  expect(
    step({
      words: ['o', 'n', 'e', '1'],
      end: 4,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(11);
  expect(
    step({
      words: ['o', 'n', 'e', 'o', 'n', 'e', 'o', 'n', 'e'],
      end: 9,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(111);
  expect(
    step({
      words: ['o', 'n', 'e', '1', 'o', 'n', 'e', 'o', 'n', 'e'],
      end: 10,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(1111);
  expect(
    step({
      words: ['o', 'n', 'e', 'o', 'n', 'e'],
      end: 6,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(11);
  expect(
    step({
      words: ['1', '1'],
      end: 2,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(11);
  expect(
    step({
      words: '100'.split(''),
      end: 3,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(100);
  expect(
    step({
      words: [
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
        'o',
        'n',
        'e',
      ],
      end: 30,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(1111111111);
  expect(
    step({
      words: ['o', 'n', 'e', '1', '1', 'o', 'n', 'e', 'o', 'n', 'e'],
      end: 11,
      decrypting: '',
      current: 0,
      result: '',
    }),
  ).toBe(11111);
});
