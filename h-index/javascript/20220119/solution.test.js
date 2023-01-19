import {sort, getHIndex, solution} from './solution';

test('sort', () => {
  expect(sort([3,0,6,1,5])).toEqual([0,1,3,5,6]);
});

test('getHIndex', () => {
  expect(getHIndex([0,1,3,5,6])).toBe(3);
})

test('solution', () => {
  expect(solution([3,0,6,1,5])).toBe(3);
  expect(solution([0,0,0,0,0])).toBe(0);
})
