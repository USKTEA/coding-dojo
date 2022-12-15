import { toJaden, solution } from './solution';

test('toJaden', () => {
  expect(toJaden({ current: 'p', previous: ' ' })).toBe('P');
  expect(toJaden({ current: 'p', previous: '' })).toBe('p');
  expect(toJaden({ current: 'p', previous: 'q' })).toBe('p');
  expect(toJaden({ current: 'p', previous: '3' })).toBe('p');
});

test('solution', () => {
  expect(solution('3people unFollowed me')).toBe('3people Unfollowed Me');
  expect(solution('for the last week')).toBe('For The Last Week');
});
