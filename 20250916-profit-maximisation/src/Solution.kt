import java.util.PriorityQueue

class Solution {
    fun solve(tickets: ArrayList<Int>, ticketToSell: Int): Int {
        val ticketPrices = PriorityQueue(Comparator.reverseOrder<Int>()).also {
            it.addAll(tickets)
        }

        var sells = 0

        repeat(ticketToSell) {
            val highestPrice = ticketPrices.poll()
            sells += highestPrice

            if (highestPrice > 1) {
                ticketPrices.offer(highestPrice - 1)
            }
        }

        return sells
    }
}
