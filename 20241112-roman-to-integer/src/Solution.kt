class Solution {
    fun romanToInt(roman: String): Int {
        return roman.foldIndexed(0) { index: Int, acc: Int, c: Char ->
            if (index + 1 > roman.lastIndex) {
                return@foldIndexed acc + toInt(c)
            }

            val currentNumber = toInt(c)
            val nextNumber = toInt(roman[index + 1])

            if (currentNumber < nextNumber) {
                return@foldIndexed acc - currentNumber
            }

            return@foldIndexed acc + currentNumber
        }
    }

    fun toInt(roman: Char): Int {
        return when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalStateException()
        }
    }
}

