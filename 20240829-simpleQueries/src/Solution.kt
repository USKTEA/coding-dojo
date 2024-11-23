import java.util.PriorityQueue
import kotlin.math.max
import kotlin.math.sqrt

class Solution {
    //[1, 2, 4], [1, 2, 3, 4, 5, 6] => [8, 8, 8, 2, 2, 1]
    fun solve(numbers: ArrayList<Int>, quries: ArrayList<Int>): ArrayList<Int> {
        val result = ArrayList<Int>()

        for (query in quries) {
            result.add(findKthNumberAfterProductByDivisor(numbers, query))
        }

        return result
    }

    fun findKthNumberAfterProductByDivisor(numbers: ArrayList<Int>, query: Int): Int {
        val queue = PriorityQueue<Int>()

        numbers.forEachIndexed { start, number ->
            var max = numbers[start]

            (start..numbers.lastIndex).forEach { end ->
                max = max(max, numbers[end])
                val product = productByDivisors(max)

                if (queue.size < query) {
                    queue.offer(product)

                    return@forEach
                }

                if (product > queue.peek()) {
                    queue.poll()
                    queue.offer(product)
                }
            }
        }

        return queue.peek()
    }

    fun productByDivisors(number: Int): Int {
        var result = 1
        val sqrt = sqrt(number.toDouble()).toInt()

        for (divisor in 1..sqrt) {
            if (number % divisor == 0) {
                if (divisor == number / divisor) {
                    result *= divisor
                    result %= 1_000_000_007

                    continue
                }

                result *= divisor
                result *= number / divisor
                result %= 1_000_000_007
            }
        }

        return result
    }

    fun getSubLists(numbers: ArrayList<Int>): MutableList<Int> {
        val subList = mutableListOf<Int>()

        numbers.forEachIndexed { start, _ ->
            var max = Int.MIN_VALUE

            (start..numbers.lastIndex).forEach { end ->
                max = max(max, numbers[end])
                subList.add(productByDivisors(max))
            }
        }

        return subList
    }
}
