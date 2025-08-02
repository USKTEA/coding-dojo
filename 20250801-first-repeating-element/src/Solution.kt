import java.util.TreeSet

class Solution {
    fun solve(numbers: ArrayList<Int>): Int {
        val numberToFirstOccurredIndex = mutableMapOf<Int, Int>()
        val indicesTreeSet = TreeSet<Indices>()

        numbers.forEachIndexed { index, number ->
            if (numberToFirstOccurredIndex[number] == null) {
                numberToFirstOccurredIndex[number] = index
            }
        }

        numbers.forEachIndexed { index, number ->
            val firstOccurredIndex = numberToFirstOccurredIndex[number] ?: return@forEachIndexed

            if (index != firstOccurredIndex) {
                indicesTreeSet.add(Indices(firstOccurredIndex, index))
            }
        }

        if (indicesTreeSet.isEmpty()) {
            return -1
        }

        return numbers[indicesTreeSet.first.firstIndex]
    }

    data class Indices(
        val firstIndex: Int,
        val secondIndex: Int
    ) : Comparable<Indices> {
        override fun compareTo(other: Indices): Int {
            return firstIndex.compareTo(other.firstIndex)
        }
    }
}
