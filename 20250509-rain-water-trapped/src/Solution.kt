import java.lang.Integer.min

class Solution {
    fun trap(bars: List<Int>): Int {
        if (bars.isEmpty()) return 0

        var left = 0
        var right = bars.lastIndex
        var leftMax = bars[left]
        var rightMax = bars[right]
        var sum = 0

        while (left < right) {
            if (leftMax < rightMax) {
                left++
                leftMax = maxOf(leftMax, bars[left])
                sum += leftMax - bars[left]
            } else {
                right--
                rightMax = maxOf(rightMax, bars[right])
                sum += rightMax - bars[right]
            }
        }

        return sum
    }

}
