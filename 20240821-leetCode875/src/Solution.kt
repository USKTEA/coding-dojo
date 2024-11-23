class Solution {
    //[3, 6, 7, 11], 8 => 4
    //[30, 11, 23, 4, 20], 5 => 30
    //최대 속도는 piles의 요소 중 가장 큰 것과 동일하다,  piles.length 만큼 시간을 소비한다
    //최저 속도는 1일다
    //eat(1, piles.max()) 재귀를 돌리면서 middle지점으로 piles를 나누면서 순회했을 때
    //만약 h를 초과한다면 1을 middle로, h를 초과하지 않는다면 middle, max로
    //start >= end일 때 반환한다
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        return eat(piles, h, 1, piles.max())
    }

    private fun eat(piles: IntArray, hour: Int, min: Int, max: Int): Int {
        val middle = min + (max - min) / 2

        if (min > max) {
            return min
        }

        var spent = 0

        for (pile in piles) {
            if (spent >= hour) {
                return eat(piles, hour, middle + 1, max)
            }

            spent += pile / middle

            if (pile % middle != 0) {
                spent += 1
            }
        }

        if (spent > hour) {
            return eat(piles, hour, middle + 1, max)
        }

        return eat(piles, hour, min, middle - 1)
    }
}
