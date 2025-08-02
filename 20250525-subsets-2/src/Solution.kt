import kotlin.collections.forEach

class Solution {
    fun subsetsWithDup(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()

        return visit(sortedNumbers = sortedNumbers)
    }

    private fun visit(
        index: Int = 0,
        sortedNumbers: List<Int>,
        answer: MutableSet<List<Int>> = mutableSetOf(),
        currentNumbers: MutableList<Int> = mutableListOf(),
    ): ArrayList<ArrayList<Int>> {
        if (index > sortedNumbers.size) {
            
        }

        answer.add(
            buildList { addAll(currentNumbers) }
        )

        (index..sortedNumbers.lastIndex).forEach {
            currentNumbers.add(sortedNumbers[it])
            visit(index = it + 1, sortedNumbers = sortedNumbers, answer = answer)
            currentNumbers.removeLast()
        }
    }
}
