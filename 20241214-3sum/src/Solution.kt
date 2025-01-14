import kotlin.math.abs

class Solution {
    //정수형 배열 numbers가 주어지고 목표 정수 destination이 주어졌을 때
    //numbers 중 3개 요소의 합이 destination과 가장 일치하는 값을 반환해라
    //결과는 하나만 존재한다
    //numbers를 정렬한다

    //firstPoint = 0 <= numbers.lastIndex - 2
    //while (firstPoint <= numbers.lastIndex -2)
    //second = firstPoint + 1
    //third = number.lastIndex

    //while(second < third)
    //minOf(min, first + second + third - destination)
    //if (second + third) > destination - first
    //second += 1
    //if (second + third) < destination - first
    //third -= 1

    fun threeSumClosest(numbers: ArrayList<Int>, destination: Int): Int {
        val sortedNumbers = numbers.sorted()
        var first = 0
        var closestSum = sortedNumbers[0] + sortedNumbers[1] + sortedNumbers[2]

        while (first <= sortedNumbers.lastIndex - 2) {
            var second = first + 1
            var third = sortedNumbers.lastIndex

            while (second < third) {
                val sum = sortedNumbers[first] + sortedNumbers[second] + sortedNumbers[third]

                if (sum == destination) {
                    return destination
                }

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
