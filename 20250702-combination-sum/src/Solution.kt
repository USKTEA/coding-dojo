class Solution {
    fun combinationSum(numbers: ArrayList<Int>, goal: Int): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val currentNumbers = mutableListOf<Int>()
        val answer = mutableSetOf<List<Int>>()

        fun backTracking(index: Int) {
            if (index > sortedNumbers.lastIndex) {
                return
            }

            if (currentNumbers.sum() > goal) {
                return
            }

            if (currentNumbers.sum() == goal) {
                answer.add(
                    buildList {
                        addAll(currentNumbers.sorted())
                    }
                )

                return
            }

            sortedNumbers.forEachIndexed { index, number ->
                currentNumbers.add(number)
                backTracking(index)
                currentNumbers.removeLast()
            }
        }

        backTracking(0)

        return ArrayList(answer.toList().map { ArrayList(it) })
    }
}
