import {
  zeroToEleven, type, distance, solution,
} from './solution';

test('changeZeroToEleven', () => {
  const changed = zeroToEleven([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]);

  expect(changed).toEqual([1, 2, 3, 4, 5, 6, 7, 8, 9, 11]);
});

test('type147', () => {
  const state = {
    left: 10, right: 12, prior: 'left', result: [],
  };

  const afterTypeOne = type(1, state);

  expect(afterTypeOne).toEqual({
    left: 1, right: 12, prior: 'left', result: ['L'],
  });
});

test('type369', () => {
  const state = {
    left: 10, right: 12, prior: 'left', result: [],
  };

  const afterTypeNine = type(9, state);

  expect(afterTypeNine).toEqual({
    left: 10, right: 9, prior: 'left', result: ['R'],
  });
});

test('whenLeftHanded', () => {
  const state = {
    left: 10, right: 12, prior: 'left', result: [],
  };

  const afterTypeEleven = type(11, state);

  expect(afterTypeEleven).toEqual({
    left: 11, right: 12, prior: 'left', result: ['L'],
  });
});

test('distance', () => {
  expect(distance(1, 4)).toBe(1);
  expect(distance(1, 7)).toBe(2);
  expect(distance(1, 8)).toBe(3);
  expect(distance(1, 11)).toBe(4);
});

test('solution', () => {
  const answer = solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], 'right');

  expect(answer).toBe('LRLLLRLLRRL');
});
