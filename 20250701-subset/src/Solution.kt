class Solution {
    fun subsets(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val answer = mutableSetOf<List<Int>>()
        val current = mutableListOf<Int>()

        fun backTracking(index: Int) {
            answer.add(ArrayList(current))

            if (index > sortedNumbers.lastIndex) {
                return
            }

            for (index in index until sortedNumbers.size) {
                current.add(sortedNumbers[index])
                backTracking(index + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return ArrayList(answer.map { ArrayList(it) })
    }
}
