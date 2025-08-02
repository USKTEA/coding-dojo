import java.util.TreeSet

class Solution {
    //numbers를 set에 집어넣어
    //index to number

    //number to indices
    fun twoSum(numbers: MutableList<Int>, goal: Int): ArrayList<Int> {
        val numberToIndices = mutableMapOf<Int, MutableList<Int>>()

        numbers.forEachIndexed { index, value ->
            numberToIndices.getOrPut(value) { mutableListOf() }.add(index)
        }

        val results = TreeSet<Indices>()

        numbers.forEachIndexed { firstIndex, value ->
            val last = goal - value
            val candidate = numberToIndices[last]

            if (candidate != null) {
                val secondIndex = candidate.firstOrNull { it > firstIndex }

                if (secondIndex != null) {
                    results.add(
                        Indices(
                            firstIndex + 1, secondIndex + 1
                        )
                    )
                }
            }
        }

        return arrayListOf(results.first.first, results.first.second)
    }

    data class Indices(
        val first: Int,
        val second: Int,
    ) : Comparable<Indices> {
        override fun compareTo(other: Indices): Int {
            if (second.compareTo(other.second) != 0) {
                return second.compareTo(other.second)
            }

            return first.compareTo(other.first)
        }
    }
}
