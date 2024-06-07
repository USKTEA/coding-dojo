class Solution {
    //[73,74,75,71,69,72,76,73] => [1,1,4,2,1,1,0,0]]
    //[30, 40] => [1, 0]
    //[30, 60, 90] => [1, 1, 0]
    //[2, 1, 1, 3] => [3, 2, 1, 0]
    //[2, 1, 1, 2] => [0, 2, 1, 0]
    //result = intArrayOf(0, ....temperatures.size)
    //.removeFirst()
    //[] => [] index - index
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size) { 0 }
        var removed = mutableListOf<Number>()
        val numbers = temperatures.mapIndexed { index, i ->
            Number(value = i, index = index)
        }.toMutableList()

        removed.add(numbers.removeFirst())

        while (numbers.isNotEmpty()) {
            val removedNumber = numbers.removeFirst()
            val copy = mutableListOf<Number>()

            while (removed.isNotEmpty()) {
                val first = removed.removeFirst()

                if (first.value < removedNumber.value) {
                    result[first.index] = removedNumber.index - first.index

                    continue
                }

                copy.add(first)
            }

            copy.add(removedNumber)
            removed = copy
        }

        return result
    }
}

data class Number(
    val value: Int,
    val index: Int,
)
