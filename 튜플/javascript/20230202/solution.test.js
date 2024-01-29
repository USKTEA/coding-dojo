import {
  parse, sort, toTuple, solution,
} from './solution';

describe('Parse', () => {
  it('주어진 문자열을 파싱한다', () => {
    const parsed = parse('{{2},{2,1},{2,1,3},{2,1,3,4}}');

    expect(parsed).toEqual([[2], [2, 1], [2, 1, 3], [2, 1, 3, 4]]);
  });
});

describe('Sort', () => {
  it('주어진 2차원 배열을 배열길이로 정렬한다', () => {
    const sorted = sort([[4, 2, 3], [3], [2, 3, 4, 1], [2, 3]]);

    expect(sorted).toEqual([[3], [2, 3], [4, 2, 3], [2, 3, 4, 1]]);
  });
});

describe('ToTuple', () => {
  it('2차월 배열을 튜플로 전환한다', () => {
    const tuple = toTuple([[3], [2, 3], [4, 2, 3], [2, 3, 4, 1]]);

    expect(tuple).toEqual([3, 2, 4, 1]);
  });
});

describe('Solution', () => {
  it('답을 반환한다1', () => {
    const answer = solution('{{4,2,3},{3},{2,3,4,1},{2,3}}');

    expect(answer).toEqual([3, 2, 4, 1]);
  });

  it('답을 반환한다2', () => {
    const answer = solution('{{123}}');

    expect(answer).toEqual([123]);
  });
});
