import kotlin.math.max
import kotlin.math.pow

class Solution {
    //[100, 4, 200, 1, 3, 2] => 4


    //[0, 3, 7, 2, 5, 8, 4, 6, 0, 1] => 9

    //[0, 0, 1, 2, 3, 4, 5, 6, 7, 8]
    //while(holder[num] !=
    fun longestConsecutive(nums: IntArray): Int {
        val numbers = mutableSetOf<Int>()

        for (number in nums) {
            numbers.add(number)
        }

        var max = 0

        for (number in numbers) {
            if (!numbers.contains(number - 1)) {
                var currentNumber = number
                var length = 1

                while (numbers.contains(currentNumber + 1)) {
                    currentNumber += 1
                    length += 1
                }

                max = max(max, length)
            }
        }

        return max
    }
}
