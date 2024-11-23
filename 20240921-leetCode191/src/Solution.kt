class Solution {
    fun hammingWeight(number: Int): Int {
        var current = number
        var count = 0

        while (current != 0) {
            current = current and (current - 1)
            count += 1
        }

        return count
    }
}
