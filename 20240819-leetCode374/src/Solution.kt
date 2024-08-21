import kotlin.math.pow

abstract class GuessGame {
    private val pick = 1702766719

    fun guess(n: Int): Int {
        if (pick == n) {
            return 0
        }

        if (pick > n) {
            return 1
        }

        return -1
    }

    abstract fun guessNumber(n: Int): Int
}

class Solution : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var min = 1
        var max = n
        var candidate = candidate(min, max)
        var result = guess(candidate)

        while (result != 0) {
            if (result == 1) {
                min = candidate + 1
                candidate = candidate(min, max)
            }

            if (result == -1) {
                max = candidate - 1
                candidate = candidate(min, max)
            }

            result = guess(candidate)
        }

        return candidate
    }

    fun candidate(min: Int, max: Int): Int {
        return min + (max - min) /2
    }
}

