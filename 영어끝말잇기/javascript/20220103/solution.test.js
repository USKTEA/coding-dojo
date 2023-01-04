import { solution } from './solution';

test('solution', () => {
  expect(solution(3, ['tank', 'kick', 'know', 'wheel',
    'land', 'dream', 'mother', 'robot', 'tank'])).toEqual([3, 3]);
});
