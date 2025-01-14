import kotlin.math.abs

class Solution {
    //[5, 10, 3, 2, 50, 80], 78 => 1
    //정수형 배열 numbers와 두 요소의 차를 나타내는 정수 difference가 주어졌을 때
    //두 요소의 차가 정확히 difference와 동일하는 두 요소가 있다면 1을 반환 없다면 0을 반환해라
    //numbers를 정렬한다
    //left = 0, right = numbers.lastIndex
    //while (left < right) {
    // if (abs(numbers[left] - numbers[right] == differece) { return 1}
    // }
    //return 0
    fun solve(numbers: ArrayList<Int>, difference: Int): Int {
        val sorted = numbers.sorted()

        var left = 0
        var right = 1

        while (left < sorted.size && right < sorted.size) {
            val currentDifference = abs(sorted[right] - sorted[left])

            if (currentDifference == difference) {
                return 1
            }

            if (currentDifference < difference) {
                right += 1
            }

            if (currentDifference > difference) {
                left += 1
                right = left + 1
            }
        }

        return 0
    }
}
