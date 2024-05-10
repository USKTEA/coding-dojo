import kotlin.math.min
import kotlin.math.roundToInt

class Solution {
    //12 => 3
    //13 => 2
    //25 => 1
    //25
    fun numSquares(n: Int): Int {
        val biggestSqrt = Math.sqrt(n.toDouble()).roundToInt()
        var answer = 0

        for (sqrt: Int in biggestSqrt downTo 1) {
            val squres = countSquares(n, sqrt)

            if (answer == 0) {
                answer = squres

                continue
            }

            answer = min(answer, squres)
        }

        return answer
    }

    fun countSquares(number: Int, square: Int, count: Int = 0): Int {
        if (square == 1) {
            return number / square + count
        }

        if (number == 0) {
            return count
        }

        if (square * square > number) {
            return countSquares(number, square - 1, count)
        }

        val subtracted = number - square * square

        var result = 0

        for (i: Int in square downTo 1) {
            val currentCount = countSquares(subtracted, i, count + 1)

            if (result == 0) {
                result = currentCount

                continue
            }

            result = min(result, currentCount)
        }

        return result
    }
}
