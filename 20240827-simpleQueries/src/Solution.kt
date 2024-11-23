import kotlin.math.sqrt

class Solution {
    //[1, 2, 4], [1, 2, 3, 4, 5, 6] => [8, 8, 8, 2, 2, 1]

    //[1, 2, 3] => [[1], [1, 2], [1, 2, 3], [2, 3], [3]]
    //[1, 2, 3, 4] => [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4], [2, 3, 4], [3, 4], [4]]

    //numbers의 모든 부분배열을 구한다.
    //부분 배열은 numbers.
    fun solve(numbers: ArrayList<Int>, queries: ArrayList<Int>): ArrayList<Int> {
        val maxNumbers = getSubLists(numbers)
        val divisorProducts = getAllDivisors(maxNumbers)

        return ArrayList(queries.map { divisorProducts[it - 1]})
    }

    fun getAllDivisors(maxNumbers: MutableList<Int>): List<Int> {
        return maxNumbers.map {
            getDivisorsProduct(it)
        }.sortedDescending()
    }

    fun getDivisorsProduct(number: Int): Int {
        var product = 1
        for (divisor in 1..sqrt(number.toDouble()).toInt()) {
            if (number % divisor == 0) {
                if (divisor == number / divisor) {
                    product *= divisor

                    continue
                }

                product *= divisor
                product *= number / divisor
            }
        }

        return product % 1_000_000_007
    }

    fun getSubLists(numbers: ArrayList<Int>): MutableList<Int> {
        val maxes = mutableListOf<Int>()

        for (start in numbers.indices) {
            var currentMax = Int.MIN_VALUE
            for (end in start until numbers.size) {
                currentMax = maxOf(currentMax, numbers[end])
                maxes.add(currentMax)
            }
        }

        return maxes
    }
}
