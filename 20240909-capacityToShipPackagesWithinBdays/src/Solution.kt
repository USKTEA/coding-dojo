import kotlin.math.max

class Solution {

    //[1, 2, 4, 5, 6, 7, 8, 9, 10], 5 => 15
    //weights를 순회하면서 값을 더하면서 가장 큰 숫자와 합을 구한다.
    //가장 큰 숫자를 이진탐색의 start로 숫자의 합을 이진탐색의 end로 지정한다.
    //중간 값을 이용해 weights를 순회하면서 모두 실을 수 있는 총 days를 구한다.
    //만약 다 실을 수 있다면 start , 중간 값 -1
    //만약 다 실을 수 없다면 중간 값 + 1, end
    //start >= end 순회하고, start를 반환한다
    fun solve(weights: ArrayList<Int>, days: Int): Int {
        val (max, sum) = getMexAndSum(weights)

        return search(weights, max, sum, days)
    }

    fun search(weights: ArrayList<Int>, start: Int, end: Int, days: Int): Int {
        if (start > end) {
            return start
        }

        val canShip = start + (end - start) / 2
        var daysNeeded = 0
        var currentCanShip = canShip

        for (weight in weights) {
            if (daysNeeded == 0) {
                daysNeeded += 1
            }

            if (currentCanShip >= weight) {
                currentCanShip -= weight

                continue
            }

            daysNeeded += 1
            currentCanShip = canShip - weight
        }

        if (daysNeeded > days) {
            return search(weights, canShip + 1, end, days)
        }

        return search(weights, start, canShip - 1, days)
    }

    fun getMexAndSum(weights: ArrayList<Int>): Pair<Int, Int> {
        return weights.fold(Pair(0, 0)) { (max, sum), weight ->
            Pair(max(max, weight), sum + weight)
        }
    }
}
