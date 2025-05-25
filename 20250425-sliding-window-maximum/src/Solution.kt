import java.time.chrono.JapaneseEra.values

class Solution {
    //1, 3, -1, -3, 5, 3, 6, 7, 3
    fun slidingMaximum(numbers: MutableList<Int>, windowSize: Int): ArrayList<Int> {
        if (windowSize > numbers.size) {
            return arrayListOf(numbers.max())
        }

        val indexDeque = ArrayDeque<Int>()
        val result = arrayListOf<Int>()

        numbers.forEachIndexed { index, value ->
            if (indexDeque.isNotEmpty() && indexDeque.first() <= index - windowSize) {
                indexDeque.removeFirst()
            }

            while (indexDeque.isNotEmpty() && numbers[indexDeque.last()] < value) {
                indexDeque.removeLast()
            }

            indexDeque.addLast(index)

            if (index >= windowSize -1) {
                result.add(numbers[indexDeque.first()])
            }
        }

        return result
    }
}
