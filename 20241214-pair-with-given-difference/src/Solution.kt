import kotlin.math.abs

class Solution {
    //정수 배열이 주어지고 구해야하는 두 숫자의 차가 주어졌을 때 정수 배열 중 두 요소의 차가 정확히 difference와 일치하는 경우의 수를 구하라
    //numbers를 오름차순으로 정렬
    //left = 0, right = numbers.lastIndex로 설정
    //left < right 조건으로 반복
    //만약 abs(numbers[right] - numbers[left]) == differecne 라면 count += 1, left += 1
    //만약 abs(numbers[right] - numbers[left]) > diff , right -= 1
    //만약 abs(numbers[right] - numbers[left]) < diff, left += 1
    fun solve(numbers: ArrayList<Int>, difference: Int): Int {
        val sortedNumbers = numbers.sorted()
        var left = 0
        var right = left + 1
        val absDifference = abs(difference)

        while (left < right && right <= sortedNumbers.lastIndex) {
            val leftNumber = sortedNumbers[left]
            val rightNumber = sortedNumbers[right]
            val currentDifference = abs(rightNumber - leftNumber)

            if (currentDifference == absDifference) {
                return 1
            }

            if (currentDifference > absDifference) {
                left += 1
                right = left + 1
            }

            if (currentDifference < absDifference) {
                right += 1
            }
        }

        return 0
    }
}
