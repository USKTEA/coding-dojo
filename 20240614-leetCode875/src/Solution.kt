import kotlin.math.ceil

class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()

        while (left < right) {
            val mid = (left + right) / 2
            var spent = 0

            for (pile in piles) {
                spent += ceil(pile.toDouble() / mid.toDouble()).toInt()
            }

            if (spent > h) {
                left = mid + 1
            }

            if (spent <= h) {
                right = mid
            }
        }

        return left
    }
}
