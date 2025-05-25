class Solution {
    fun combine(oneBaseNumbersMax: Int, combinationSize: Int): ArrayList<ArrayList<Int>> {
        val answer = mutableListOf<List<Int>>()
        val combination = mutableListOf<Int>()

        fun backTracking(currentNumber: Int) {
            if (combination.size == combinationSize) {
                answer.add(buildList { addAll(combination) })
                return
            }

            (currentNumber..oneBaseNumbersMax).forEach { number ->
                combination.add(number)
                backTracking(number + 1)
                combination.removeLast()
            }
        }

        backTracking(1)

        return ArrayList(answer.map { ArrayList(it) })
    }
}
