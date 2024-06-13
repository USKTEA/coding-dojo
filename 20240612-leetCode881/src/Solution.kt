class Solution {

    fun numRescueBoats(people: IntArray, limit: Int): Int {
        val sorted = people.sorted()
        var left = 0
        var right = sorted.lastIndex
        var answer = 0

        while (left <= right) {
            answer += 1

            if (sorted[left] + sorted[right] <= limit) {
                left += 1
            }

            right -= 1
        }

        return answer
    }
}
