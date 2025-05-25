class Solution {
    fun subsets(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val result = arrayListOf<ArrayList<Int>>()
        val current = mutableListOf<Int>()

        fun backTracking(index: Int) {
            result.add(ArrayList(current))

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

        return result
    }
}
