class Solution {
    fun solution(changeAmount: Int, returnAmount: Int, total: Int): Int {
        return calculate(changeAmount, returnAmount, total)
    }

    fun calculate(changeAmount: Int, returnAmount: Int, total: Int, current: Int = 0): Int {
        if (total < changeAmount) {
            return current
        }

        val (afterExchange, exchangedAmount) = exchange(changeAmount, returnAmount, total)

        return calculate(changeAmount, returnAmount, afterExchange, current + exchangedAmount)
    }

    fun exchange(changeAmount: Int, returnAmount: Int, total: Int): Pair<Int, Int> {
        val afterExchange = (total % changeAmount) + ((total / changeAmount) * returnAmount)
        val exchangedAmount = total / changeAmount * returnAmount

        return Pair(afterExchange, exchangedAmount)
    }
}
