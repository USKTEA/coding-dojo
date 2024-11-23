class Solution {
    fun numSetBits(number: Long): Int {
        var current = number
        var count = 0

        while (current != 0L) {
            current = current and (current - 1)
            count += 1
        }

        return count
    }

    fun trailingZeros(number: Int): Int {
        if (number == 0) {
            return 1
        }

        var count = 0
        var current = number

        while (current and 1 == 0) {
            current = current shr 1
            count += 1
        }

        return count
    }

    fun reverse(number: Long): Long {
        var result = 0L
        var current = number

        repeat(32) {
            result = (result shl 1) or (current and 1)
            current = current ushr 1
        }

        return result
    }
}
