class Solution {
    //[100, 300] => [123, 234]
    //[1000, 13000] => [1234, 2345, 3456, 5678, 12345]
    //[10, 10] => []
    //[10, 13] => [12]
    //10 < number < 1,000,000,000
    //val lowest = lowestSequentailDtigits(low)
    //while (lowest < hight) { digits.add(lowest), lowest.next()}
    //return digits
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        var lowestSequentialDigit = getLowestSequentialDigit(low)
        val digits = mutableListOf<SequentialDigit>()

        while (lowestSequentialDigit <= high) {
            if (lowestSequentialDigit < low) {
                lowestSequentialDigit = lowestSequentialDigit.next()
                continue
            }

            digits.add(lowestSequentialDigit)
            lowestSequentialDigit = lowestSequentialDigit.next()
        }

        return digits.map { it.number() }
    }

    private fun getLowestSequentialDigit(low: Int): SequentialDigit {
        val digitSize = low.toString().length

        return SequentialDigit.ofSize(digitSize)
    }
}

data class SequentialDigit(
    var digits: MutableList<Int>
) {
    operator fun compareTo(number: Int): Int {
        val digitNumber = digits.fold(0) { acc, i ->
            acc * 10 + i
        }

        if (digitNumber > number) {
            return 1
        }

        if (digitNumber == number) {
            return 0
        }

        return -1
    }

    fun next(): SequentialDigit {
        val nextDigit = digits.map {
            val nextNumber = it + 1

            if (nextNumber == 10) {
                return ofSize(digitSize = digits.size + 1)
            }

            nextNumber
        }.toMutableList()

        return SequentialDigit(
            digits = nextDigit
        )
    }

    fun number(): Int {
        return digits.fold(0) { acc, i -> acc * 10 + i }
    }

    companion object {
        fun ofSize(digitSize: Int): SequentialDigit {
            val digits = MutableList(digitSize) { index: Int -> index + 1 }

            return SequentialDigit(
                digits = digits
            )
        }
    }
}
