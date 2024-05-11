import kotlin.math.min

class Solution {
    //[2, 3, 3, 2, 2, 4, 2, 3, 4] => 4
    //[2, 1, 2, 2, 3, 3] => -1
    //map(number, count)
    //forEach if (count % 2 || count % 3) != 0 return -1
    //count ++ getMinOperation(count)
    //return count
    fun minOperations(nums: IntArray): Int {
        val numberAndCounts = nums.fold(mutableMapOf<Int, Int>()) { acc, number ->
            val numberOccurrence = acc.getOrDefault(number, 0)
            acc[number] = numberOccurrence + 1
            acc
        }

        val operationCounts = numberAndCounts.values.fold(
            Pair(
                0,
                mutableMapOf<Int, Int>()
            )
        ) { (count, cache), numberOccurrence ->
            val operationCount = calculateMinimumOperation(numberOccurrence, numberOccurrence, 0, cache)
            if (operationCount == Int.MAX_VALUE) {
                return -1
            }

            Pair(count + operationCount, cache)
        }

        return operationCounts.first
    }

    fun calculateMinimumOperation(
        numberOccurrence: Int,
        subtracted: Int,
        count: Int = 0,
        cache: MutableMap<Int, Int> = mutableMapOf(),
    ): Int {
        if (subtracted < 0) {
            return Int.MAX_VALUE
        }

        if (subtracted == 0) {
            return count
        }

        if (cache.containsKey(numberOccurrence)) {
            return cache.getValue(numberOccurrence)
        }

        val min = min(
            calculateMinimumOperation(numberOccurrence, subtracted - 3, count + 1, cache),
            calculateMinimumOperation(numberOccurrence, subtracted - 2, count + 1, cache)
        )

        if (min != Int.MAX_VALUE) {
            cache[numberOccurrence] = min
        }

        return min
    }
}
