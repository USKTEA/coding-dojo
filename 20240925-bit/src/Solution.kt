class Solution {
    fun numSetBits(a: Long): Int {
        var current = a
        var count = 0

        while (current != 0L) {
            current = current and (current - 1)
            count += 1
        }

        return count
    }

    fun trailingZeros(a: Int): Int {
        if (a == 0) {
            return 1
        }

        var current = a
        var count = 0

        while (current and 1 == 0) {
            current = current ushr 1
            count += 1
        }

        return count
    }

    fun reverse(number: Long): Long {
        var current = number
        var result = 0L

        repeat(32) {
            result = result shl 1 or (current and 1)
            current = current ushr 1
        }

        return result
    }
}
