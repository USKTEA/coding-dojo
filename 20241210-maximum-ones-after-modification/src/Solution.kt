class Solution {
    fun solve(bits: ArrayList<Int>, maximumZeroCount: Int): Int {
        var left = 0
        var right = 0
        var zeros = 0
        var maxLength = 0

        while (right <= bits.lastIndex) {
            if (bits[right] == 0) {
                zeros += 1
            }

            while (zeros > maximumZeroCount) {
                if (bits[left] == 0) {
                    zeros -= 1
                }

                left += 1
            }

            maxLength = maxOf(maxLength, right - left + 1)
            right += 1
        }

        return maxLength
    }
}
