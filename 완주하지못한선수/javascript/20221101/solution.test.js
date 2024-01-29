import { toMap, getNotCompleted, getName, solution } from './solution';

test('participantToMap', () => {
  expect(toMap(['leo', 'kiki', 'eden'])).toEqual(
    new Map([
      ['leo', 1],
      ['kiki', 1],
      ['eden', 1],
    ]),
  );
});

test('getNotCompleted', () => {
  expect(
    getNotCompleted(
      new Map([
        ['leo', 1],
        ['kiki', 1],
        ['eden', 1],
      ]),
      ['kiki', 'eden'],
    ),
  ).toEqual(new Map([['leo', 1]]));
});

test('getName', () => {
  expect(getName(new Map([['leo', 1]]))).toBe('leo');
});

test('solution', () => {
  expect(solution(['leo', 'kiki', 'eden'], ['eden', 'kiki'])).toBe('leo');
  expect(
    solution(
      ['mislav', 'stanko', 'mislav', 'ana'],
      ['stanko', 'ana', 'mislav'],
    ),
  ).toBe('mislav');
});
