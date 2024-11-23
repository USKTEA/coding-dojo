import kotlin.math.min

class Solution {
    fun numSetBits(a: Long): Int {
        var count = 0
        var current = a
        while (current != 0L) {
            current = current and (current - 1)
            count += 1
        }

        return count
    }

    fun trailingZeros(number: Int): Int {
        if (number == 0) {
            return 0
        }

        var count = 0
        var current = number

        while (current and 1 != 1) {
            current = current.ushr(1)
            count += 1
        }

        return count
    }

    fun reverse(number: Long): Long {
        var result = 0L
        var current = number

        repeat(32) {
            result = (result shl 1) or (current and 1L)
            current = current ushr 1
        }


        return result
    }

    fun singleNumber(numbers: List<Int>): Int {
        var result = 0

        for (number in numbers) {
            result = result xor number
        }

        return result
    }

    fun singleNumberThrice(numbers: List<Int>): Int {
        var result = 0

        repeat(32) { index ->
            var count = 0

            for (number in numbers) {
                if ((number and (1 shl index)) != 0) {
                    count += 1
                }
            }

            if (count % 3 != 0) {
                result = result or 1 shl index
            }
        }

        return result
    }

    fun findMinXor(numbers: ArrayList<Int>): Int {
        val sorted = numbers.sorted()
        var min = Int.MAX_VALUE

        for (i in 0 until sorted.size - 1) {
            min = min(min, sorted[i] xor sorted[i + 1])
        }

        return min
    }

    fun xorSubarrays(numbers: ArrayList<Int>) : Int {
        return 0
    }
}
