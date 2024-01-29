import getAnswer from './solution';

test('solution', () => {
  const answer = getAnswer('1 2 3 4');

  expect(answer).toBe('1 4');

  const answer2 = getAnswer('-1 -2 -3 -4');

  expect(answer2).toBe('-4 -1');
});
