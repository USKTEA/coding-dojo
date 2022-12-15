import { toJaden, jadenConvertor } from './solution';

test('toJaden', () => {
  expect(toJaden({ current: 'p', previous: ' ' })).toBe('P');
  expect(toJaden({ current: 'p', previous: '' })).toBe('p');
  expect(toJaden({ current: 'p', previous: 'q' })).toBe('p');
  expect(toJaden({ current: 'p', previous: '3' })).toBe('p');
});

test('jadenConvertor', () => {
  expect(jadenConvertor('3people unFollowed me')).toBe('3people Unfollowed Me');
  expect(jadenConvertor('for the last week')).toBe('For The Last Week');
});
