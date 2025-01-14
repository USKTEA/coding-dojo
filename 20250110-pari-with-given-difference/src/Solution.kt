import kotlin.math.abs

class Solution {
    //[5, 10, 3, 2, 50, 80], 78 => 1
    //정수형 배열 numbers와 정수 difference가 주어졋을 때
    //정수형 배열에서 서로 다른 두 개의 요소의 차이가 정확히 difference와 일치하는 케이스가 있는 경우 1을 반환, 없는 경우 0을 반환한다
    //numbers를 정렬한다
    //차이는 abs
    //left < right && right <= sorted.lastIndex
    //val leftNumber, val rightNumber
    //val currentDifsAbs = abs(leftNumber - rightNumber)
    //if (currentIdfsAbs == differece) return 1
    //if (currentDifs < difference) { right += 1}
    //if (currentDifs > differece) { left += 1, right = left += 1}
    //left += 1
    fun solve(numbers: ArrayList<Int>, difference: Int): Int {
        val sortedNumbers = numbers.sorted()
        val differenceAbs = difference
        var left = 0
        var right = 1

        while (left < right && right <= sortedNumbers.lastIndex) {
            val currentDifferenceAbs = abs(numbers[left] - numbers[right])

            when (currentDifferenceAbs.compareTo(differenceAbs)) {
                0 -> return 1
                1 -> {
                    left += 1
                    right = left + 1
                }

                -1 -> {
                    right += 1
                }
            }
        }

        return 0
    }
}
