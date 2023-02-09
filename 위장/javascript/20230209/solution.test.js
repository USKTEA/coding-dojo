import { toMap, getVariations, solution } from './solution';

describe('toMap', () => {
  it('입력받은 2차원 배열을 map으로 변환한다', () => {
    expect(
      [...toMap([['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']]).keys()],
    ).toHaveLength(2);
  });
});

describe('getVariations', () => {
  it('입력받은 Map의 경우의 수를 구한다', () => {
    const costumes = toMap([['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']]);

    expect(getVariations(costumes)).toBe(5);
  });
});

describe('solution', () => {
  it('정답을 도출한다', () => {
    expect(solution([['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']])).toBe(5);
  });
});
