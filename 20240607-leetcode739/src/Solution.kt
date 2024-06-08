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
        val stack = mutableListOf<Number>()

        temperatures.forEachIndexed { index, temp ->
            while (stack.isNotEmpty() && stack.last().value < temp) {
                val last = stack.removeLast()
                result[last.index] = index - last.index
            }

            stack.add(Number(temp, index))
        }

        return result
    }
}

data class Number(
    val value: Int,
    val index: Int,
)
