class Solution {
    fun findMinXor(numbers: ArrayList<Int>): Int {
        val sorted = numbers.sorted()
        var min = Int.MAX_VALUE

        for (i in 0..<sorted.lastIndex - 1) {
            min = Math.min(min, sorted[i] xor sorted[i + 1])
        }

        return min
    }

    fun solve(numbers: ArrayList<Int>): Int {
        if (numbers.size % 2 == 0) {
            return 0
        }

        var result = 0

        for (i in 0..numbers.size step 2) {
            result = result xor numbers[i]
        }

        return result
    }
}
