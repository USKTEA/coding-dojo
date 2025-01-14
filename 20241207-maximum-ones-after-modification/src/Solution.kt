import kotlin.math.max

class Solution {
    //0 또는 1이 들어있는 정수열 배열이 주어지고, 0을 1로 변환할 수 있는 횟수인 not가 주어질 때
    //최대 nots만큼 0을 1로 변환했을 때 1이 최대로 연결되어 있을 수 있는 길이를 구해라

    fun solve(bits: ArrayList<Int>, maximumZeros: Int): Int {
        var right = 0
        var left = 0
        var zeroCounts = 0
        var oneCounts = 0

        while (right <= bits.lastIndex) {
            if (bits[right] == 0) {
                zeroCounts += 1
            }

            while (zeroCounts > maximumZeros) {
                if (bits[left] == 0) {
                    zeroCounts -= 1
                }

                left += 1
            }

            oneCounts = max(oneCounts, right - left + 1)
            right += 1
        }

        return oneCounts
    }
}
