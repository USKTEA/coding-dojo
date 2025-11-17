import java.util.PriorityQueue

class Solution {
    fun solve(numbers: ArrayList<Int>): Int {
        val sortedNumbers = PriorityQueue(numbers)
        var cost = 0

        while (sortedNumbers.size > 1) {
            val leftOperand = sortedNumbers.poll()
            val rightOperand = sortedNumbers.poll()

            cost += (leftOperand + rightOperand)

            sortedNumbers.offer(leftOperand + rightOperand)
        }

        return cost
    }
}
