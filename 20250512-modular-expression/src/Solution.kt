import kotlin.math.abs

class Solution {
    fun mod(operand: Int, power: Int, divide: Int): Int {
        if (power == 0) {
            return divide(
                result = Result(
                    quotient = 0,
                    remainder = 1,
                ),
                divider = divide,
            ).remainder
        }

        return divide(
            result = Result(
                quotient = 0,
                remainder = power(result = 1, operand = operand, time = power)
            ),
            divider = divide,
        ).remainder
    }

    private fun power(result: Int = 1, operand: Int, time: Int): Int {
        if (time == 0) {
            return operand
        }

        return power(result * operand, operand, time - 1)
    }

    private fun divide(result: Result, divider: Int): Result {
        if (result.remainder < 0) {
            if (abs(result.remainder) == divider) {
                return Result(
                    quotient = result.quotient + 1,
                    remainder = 0,
                )
            }

            return result.copy(
                quotient = result.quotient + 1,
                remainder = result.remainder + divider,
            )
        }

        if (result.remainder < divider) {
            return result
        }

        return result.copy(
            quotient = result.quotient + 1,
            remainder = result.remainder - divider,
        )
    }
}

data class Result(
    val quotient: Int,
    val remainder: Int,
)
