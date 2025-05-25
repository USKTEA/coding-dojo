class Solution {
    fun combinationSum(numbers: ArrayList<Int>, goal: Int): ArrayList<ArrayList<Int>> {
        val sortedNumbers = numbers.sorted()
        val currentNumbers = mutableListOf<Int>()
        val answer = mutableSetOf<Combination>()

        fun backTracking(index: Int) {
            if (index > sortedNumbers.lastIndex) {
                return
            }

            if (currentNumbers.sum() > goal) {
                return
            }

            if (currentNumbers.sum() == goal) {
                answer.add(
                    Combination(
                        buildList {
                            addAll(currentNumbers.sorted())
                        }
                    )
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

        return ArrayList(answer.toList().sorted().map { ArrayList(it.elements) })
    }
}

data class Combination(
    val elements: List<Int>,
) : Comparable<Combination> {
    override fun equals(other: Any?): Boolean {
        return this.elements == (other as Combination).elements
    }

    override fun hashCode(): Int {
        return elements.hashCode()
    }

    override fun compareTo(other: Combination): Int {
        for (index in this.elements.indices) {
            val number = this.elements[index]
            val otherNumber = other.elements.getOrNull(index)

            if (otherNumber == null) {
                return -1
            }

            if (number == otherNumber) {
                continue
            }

            if (number > otherNumber) {
                return 1
            }

            return -1
        }

        return 0
    }
}
