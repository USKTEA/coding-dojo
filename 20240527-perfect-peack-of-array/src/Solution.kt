import kotlin.math.max

class Solution {
    //[5, 1, 4, 3, 6, 8, 10, 7, 9] => 1
    //[5, 1, 4, 4] => 0
    //[1, 2, 3] => 1
    //[1, 1, 2, 3] => 1
    //toSet()
    //var left = numbers[0]
    //for (i in 1 .. < numbers.size) {
    //  val current = number[i]
    // if (current > number) {
    // for (number.lastIndex down to i) {
    // if (number[j] >= current) { continue }
    // }
    // }
    // }
    fun perfectPeak(numbers: ArrayList<Int>): Int {
        var left = numbers[0]

        for (i in 1..numbers.lastIndex) {
            val currentNumber = numbers[i]
            val temp = left
            left = max(left, currentNumber)

            if (currentNumber > temp) {
                for (j in numbers.lastIndex downTo i) {
                    if (i == j && i != numbers.lastIndex) {
                        println(numbers[i])
                        return 1
                    }

                    if (currentNumber >= numbers[j]) {
                        break
                    }
                }
            }
        }

        return 0
    }
}
