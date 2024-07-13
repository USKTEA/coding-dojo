import kotlin.math.max

class Solution {
    //[1, 12, -5, -6, 50, 3], 4 => 12.75
    //[5], 1 => 5.0

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val deque = ArrayDeque<Int>()
        var sum = 0.0
        var max: Double? = null

        for (number in nums) {
            if (deque.size < k) {
                deque.addLast(number)
                sum += number
            }

            if (deque.size == k) {
                if (max == null) {
                    max = sum / k
                }

                if (max != null) {
                    max = max(sum / k, max)
                }

                sum -= deque.removeFirst()
            }
        }

        return requireNotNull(max)
    }
}
