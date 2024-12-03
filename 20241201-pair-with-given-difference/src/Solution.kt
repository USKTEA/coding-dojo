import kotlin.math.abs

class Solution {
    //정수 배열 numbers가 주어졌을 때 요소의 차가 difference와 동일한 요소쌍이 있다면 1을 반환 아니면 0을 반환
    //numbers를 정렬 후 첫 요소와 첫 요소 + 1의 차 부터 비교하기 시작한다
    //두 요소의 차는 n - n + 1, n + 1 - n 으로 구할 수 있다
    //만약 difference와 동일하다면 1을 즉시 반환한다
    //만약 차가 difference보다 작다면 right + 1
    //만약 차가 difference보다 크다면 left + 1
    //left != right, right <= numbers.lastIndex 까지 반복한다
    fun solve(numbers: ArrayList<Int>, difference: Int): Int {
        val sortedNumbers = numbers.sorted()
        val differenceAbs = abs(difference)
        var left = 0
        var right = left + 1

        while (left <= right && right <= sortedNumbers.lastIndex) {
            val leftNumber = sortedNumbers[left]
            val rightNumber = sortedNumbers[right]
            val leftRightDifference = abs(leftNumber - rightNumber)

            if (leftRightDifference == differenceAbs) {
                return 1
            }

            if (leftRightDifference < differenceAbs) {
                right += 1
            }

            if (leftRightDifference > differenceAbs) {
                left += 1
                right = left + 1
            }
        }

        return 0
    }
}
