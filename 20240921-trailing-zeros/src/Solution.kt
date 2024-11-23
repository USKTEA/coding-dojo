class Solution {
    fun solve(number: Int): Int {
        var current = number
        var count = 0

        while (current and 1 == 0) {
            current = current ushr 1
            count += 1
        }

        return count
    }
}
