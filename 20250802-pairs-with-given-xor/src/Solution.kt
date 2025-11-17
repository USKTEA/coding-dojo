class Solution {
    fun solve(numbers: ArrayList<Int>, target: Int): Int {
        val seen = mutableSetOf<Int>()
        var count = 0

        for (x in numbers) {
            val y = x xor target
            if (y in seen) {
                count++
            }
            seen.add(x)
        }

        return count
    }
}
