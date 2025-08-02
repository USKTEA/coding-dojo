class Solution {
    fun subsets(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val answer = mutableSetOf<ArrayList<Int>>()
        val current = mutableListOf<Int>()

        fun backTracking(index: Int) {
            answer.add(
                ArrayList(current)
            )

            if (index > sortedNumbers.lastIndex) {
                return
            }

            (index..sortedNumbers.lastIndex).forEach { currentIndex ->
                current.add(sortedNumbers[currentIndex])
                backTracking(currentIndex + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return ArrayList(answer.map { ArrayList(it) })
    }
}
