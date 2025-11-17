import java.util.Comparator
import java.util.PriorityQueue

class Solution {
    fun nchoc(tries: Int, chocolates: ArrayList<Int>): Int {
        val chocolatesPq = PriorityQueue(Comparator.reverseOrder<Int>()).apply {
            this.addAll(chocolates)
        }
        var result: Long = 0

        repeat(tries) {
            val chocolate = chocolatesPq.poll()
            result = (result + chocolate) % 1000000007
            chocolatesPq.offer(chocolate.floorDiv(2))
        }

        return result.toInt()
    }
}
