import kotlin.time.times

class Solution {

    //[5, 1, 3], [1, 2, 3, 4, 5], 7 => [4, 0, 3]
    //potions를 정렬한다
    //spells를 순회하면서 이진탐색으로 spell * potion이 success보다 작을 때 까지 찾는다
    //sepll * portion이 success보다 작은 것을 찾았으면 result[index] = potion.size - middle

    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        val cache : MutableMap<Int, Int> = mutableMapOf()

        val sorted = potions.sorted()

        return spells.map { spell ->
            cache[spell]?.let {
                return@map it
            }

            val pairs = findPairs(
                spell = spell,
                sortedPotions = sorted,
                success = success,
                start = 0,
                end = sorted.lastIndex
            )

            cache[spell] = pairs
            pairs
        }.toIntArray()
    }

    fun findPairs(spell: Int, sortedPotions: List<Int>, success: Long, start: Int, end: Int): Int {
        val middle = start + (end - start) / 2
        val middlePotion = sortedPotions[middle]
        val product = spell.toLong() * middlePotion

        if (start >= end) {
            if (product >= success) {
                return sortedPotions.lastIndex - start + 1
            }

            return sortedPotions.lastIndex - start
        }

        if (product >= success) {
            return findPairs(spell, sortedPotions, success, start, middle - 1)
        }

        return findPairs(spell, sortedPotions, success, middle + 1, end)
    }
}
