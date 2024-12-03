import kotlin.math.abs

class Solution {
    //정수열 배열을 받고 정수열 배열 중 3개 요소의 합이 destination과 가장 가까운 합을 구하는 문제
    //정수열 배열 정렬 후 첫 번째 요소부터 마지막 3번째 요소까지 순회
    //left는 첫 번째 요소의 +1, 마지막은 마지막 요소
    //만약 i + left + right 이 destination과 같다면 바로 합 반환
    //만약 i + left + right의 값이 destination보다 크다면 right -= 1
    //만약 i + left + right의 값이 destination보다 작다면 left += 1
    //left > right 라면
    // i += 1
    //numbers를 순회하면서 현재까지 가장 차이가 작은 요소를 가지고 있어야 한다
    fun threeSumClosest(numbers: ArrayList<Int>, destination: Int): Int {
        var currentIndex = 0
        var closestSumToDestination = 0
        val sortedNumber = numbers.sorted()

        while (currentIndex <= numbers.lastIndex - 2) {
            var left = currentIndex + 1
            var right = numbers.lastIndex

            while (left < right) {
                val sum = sortedNumber[currentIndex] + sortedNumber[left] + sortedNumber[right]

                if (sum == destination) {
                    return sum
                }

                if (abs(destination - sum) < abs(destination - closestSumToDestination)) {
                    closestSumToDestination = sum
                }

                if (sum > destination) {
                    right -= 1
                }

                if (sum < destination) {
                    left += 1
                }
            }

            currentIndex += 1
        }

        return closestSumToDestination
    }
}
