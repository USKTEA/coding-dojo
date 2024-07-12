import kotlin.math.min

class Solution {
    //[1, 2, 3, 4], 5 => 2
    //[3, 1, 3, 4, 3], 6 => 1
    //[1, 1], 2 => 1
    //[1, 1], 1 => 0
    fun maxOperations(nums: IntArray, k: Int): Int {
        val occurrences = count(nums)

        return countPair(occurrences, k)
    }

    fun count(numbers: IntArray): MutableMap<Int, Int> {
        return numbers.fold(mutableMapOf()) { acc, i ->
            val count = acc.getOrDefault(i, 0)
            acc[i] = count + 1
            acc
        }
    }

    fun countPair(occurrences: MutableMap<Int, Int>, pair: Int): Int {
        return occurrences.keys.fold(0) { pairCounts, number ->
            val count = occurrences.getValue(number)
            val pairCount = occurrences.getOrDefault(pair - number, 0)

            if (number + number == pair) {
                if (count < 2) {
                    return@fold pairCounts
                }

                occurrences[number] = count % 2

                return@fold pairCounts + count / 2
            }

            if (count == 0) {
                return@fold pairCounts
            }


            if (pairCount == 0) {
                return@fold pairCounts
            }

            val min = min(count, pairCount)
            occurrences[number] = count - min
            occurrences[pair - number] = pairCount - min

            pairCounts + min
        }
    }
}
