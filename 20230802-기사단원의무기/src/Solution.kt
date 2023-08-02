import kotlin.math.pow

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        return Array(number) { it + 1 }.map {
            countDivisors(it)
        }.sumOf {
            if (it > limit) {
                power
            } else it
        }
    }

    fun countDivisors(number: Int): Int {
        if (number === 1) {
            return 1
        }

        val partition = partition(number)

        var count = 0

        for (i in 1..partition) {
            if (number % i == 0) {
                count += if (number / i == i) 1 else 2
            }
        }

        return count
    }

    fun partition(number: Int): Int {
        if (number <= 2) {
            return 1
        }

        return IntArray(number) { it + 1 }.reduce { acc, i ->
            if (acc.toDouble().pow(2) > number) {
                return acc - 1
            }

            if (acc.toDouble().pow(2).toInt() == number) {
                return acc
            }

            acc + 1
        }
    }
}
