import java.util.*

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val queue1 = toQueue(cards1)
        val queue2 = toQueue(cards2)

        val result = goal.foldIndexed(Array(goal.size) { "" }) { index, result, word ->
            val queue1word = queue1.peek()
            val queue2word = queue2.peek()

            if (word != queue1word && word != queue2word) {
                return@foldIndexed result
            }

            if (word == queue1.peek()) {
                result[index] = queue1.pollFirst()
            }

            if (word == queue2.peek()) {
                result[index] = queue2.pollFirst()
            }

            result
        }

        if (result.contentEquals(goal)) {
            return "Yes"
        }

        return "No"
    }

    private fun toQueue(array: Array<String>): LinkedList<String> {
        return LinkedList(array.toList())
    }
}