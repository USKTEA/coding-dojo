import {
  originStatus, reflectReserve, reflectLost, borrowFromBackAndForth,
  countHaveClothMoreThanOne, solution,
} from './solution';

test('학생 수를 반영한 map 생성', () => {
  expect(originStatus(5)).toEqual(
    new Map([[1, 1], [2, 1], [3, 1], [4, 1], [5, 1]]),
  );
});

test('예비 체육복 반영', () => {
  expect(reflectReserve([1, 3, 5])(new Map([[1, 1], [2, 1], [3, 1], [4, 1], [5, 1]]))).toEqual(
    new Map([
      [1, 2],
      [2, 1],
      [3, 2],
      [4, 1],
      [5, 2],
    ]),
  );
});

test('도난 당한 체육복 반영', () => {
  expect(reflectLost([2, 4])(new Map([[1, 2], [2, 1], [3, 2], [4, 1], [5, 2]]))).toEqual(
    new Map(
      [
        [1, 2],
        [2, 0],
        [3, 2],
        [4, 0],
        [5, 2],
      ],
    ),
  );
});

test('체육복을 가지고 있지 않은 학생이 인근 번호 학생의 체육복을 빌렸을 경우 반영', () => {
  expect(borrowFromBackAndForth(
    new Map([[1, 2], [2, 0], [3, 2], [4, 0], [5, 2]]),
  )).toEqual(new Map([[1, 1], [2, 1], [3, 1], [4, 1], [5, 2]]));
});

test('체육복을 1개 이상 가지고 있는 학생의 수 반환', () => {
  expect(countHaveClothMoreThanOne(
    new Map([[1, 1], [2, 1], [3, 1], [4, 1], [5, 2]]),
  )).toBe(5);
});

test('solution', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toBe(5);
  expect(solution(3, [3], [1])).toBe(2);
  expect(solution(5, [2, 4], [3])).toBe(4);
  expect(solution(5, [3, 5], [2, 4])).toBe(5);
  expect(solution(5, [2, 4], [3])).toBe(4);
});
