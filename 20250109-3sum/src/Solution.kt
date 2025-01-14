import kotlin.math.abs

class Solution {
    //[-1, 2, 1, -4], 1
    //정수형 배열 numbers와 정수 destination이 주어졌을 때
    //destination과 가장 가까운 numbers의 서로 다른 3개 요소의 합을 구하라.
    //numbers를 정렬한다
    //sum
    //while (first <= sorted.lastIndex - 2)
    //while (sum < destination) {
    //
    // }
    fun threeSumClosest(numbers: ArrayList<Int>, destination: Int): Int {
        val sortedNumbers = numbers.sorted()
        var first = 0
        var closestSum = sortedNumbers[0] + sortedNumbers[1] + sortedNumbers[2]

        if (closestSum == destination) {
            return destination
        }

        while (first <= sortedNumbers.lastIndex - 2) {
            var second = first + 1
            var third = sortedNumbers.lastIndex

            while (second < third) {
                val sum = sortedNumbers[first] + sortedNumbers[second] + sortedNumbers[third]

                if (abs(destination - sum) < abs(destination - closestSum)) {
                    closestSum = sum
                }

                if (sum > destination) {
                    third -= 1
                }

                if (sum < destination) {
                    second += 1
                }
            }

            first += 1
        }

        return closestSum
    }
}
