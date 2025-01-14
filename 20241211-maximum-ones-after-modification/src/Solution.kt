import kotlin.math.max

class Solution {
    fun solve(bits: ArrayList<Int>, maximumZeroCounts: Int): Int {
        var right = 0
        var left = 0
        var zeros = 0
        var ones = 0

        //1, 0, 0, 1, 1, 0, 1
        while (right <= bits.lastIndex) {
            if (bits[right] == 0) {
                zeros += 1
            }

            while (zeros > maximumZeroCounts) {
                if (bits[left] == 0) {
                    zeros -= 1
                }

                left += 1
            }

            ones = max(ones, right - left + 1)
            right += 1
        }

        return ones
    }
}
