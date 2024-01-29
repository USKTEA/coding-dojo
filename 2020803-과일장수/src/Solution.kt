class Solution {
    fun solution(highest: Int, packAmount: Int, apples: IntArray): Int {
        if (packAmount > apples.size) {
            return 0
        }

        val sortedApples = apples.sortedDescending()

        return sortedApples.windowed(packAmount, packAmount)
            .map { box ->
                box.map { box.last() }
            }.flatten()
            .sum()
    }
}
