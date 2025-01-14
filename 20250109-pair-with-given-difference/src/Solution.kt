import kotlin.math.abs

class Solution {
    //[80, 2], 78 -> 1
    fun solve(numbers: ArrayList<Int>, difference: Int): Int {
        val sortedNumbers = numbers.sorted()
        val absDifference = abs(difference)
        var left = 0
        var right = 1

        while (left < right && right <= numbers.lastIndex) {
            val leftNumber = sortedNumbers[left]
            val rightNumber = sortedNumbers[right]
            val currentAbsDifference = abs(leftNumber - rightNumber)

            if (currentAbsDifference == absDifference) {
                return 1
            }

            if (currentAbsDifference < absDifference) {
                right += 1
                continue
            }

            left += 1
            right = left + 1
        }

        return 0
    }
}
