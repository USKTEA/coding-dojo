import kotlin.math.max

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var current = 0
        var max = current

        for (height in gain) {
            current += height
            max = max(max, current)
        }

        return max
    }
}
