class Solution {
    fun combinationSum(numbers: ArrayList<Int>, goal: Int): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val answer = mutableSetOf<List<Int>>()
        val currentNumbers = mutableListOf<Int>()

        fun backTracking(index: Int) {
            if (index > sortedNumbers.lastIndex) {
                return
            }

            if (currentNumbers.sum() == goal) {
                answer.add(buildList { addAll(currentNumbers.sorted()) })
                return
            }

            if (currentNumbers.sum() > goal) {
                return
            }

            (index..sortedNumbers.lastIndex).forEach { number ->
                currentNumbers.add(sortedNumbers[number])
                backTracking(number + 1)
                currentNumbers.removeLast()
            }
        }

        backTracking(0)

        return ArrayList(answer.map { ArrayList(it.toList()) })
    }
}
