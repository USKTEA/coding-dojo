class Solution {
    //[1, 2, 1, 2, 3], 2
    //right와 left를 가진다
    //left <= numbers.lastIndex , right <= numbers.lastIndex
    //if acc.add(numbers[right])
    //acc.distinct > maximumDistinct
    //acc.removeLast()

    //while acc.distinct <= maximumDistinct
    //acc.removeFirst()
    //left += 1

    fun solve(numbers: ArrayList<Int>, targetDistinct: Int): Int {
        return atMost(numbers, targetDistinct) - atMost(numbers, targetDistinct - 1)
    }

    private fun atMost(numbers: ArrayList<Int>, maxDistinct: Int): Int {
        if (maxDistinct == 0) {
            return 0
        }

        var left = 0
        var right = 0
        var result = 0
        val distinctKnowledgeMap = DistinctKnowledgeMap()

        while (right < numbers.size) {
            // right 포인터 이동하며 숫자 추가
            distinctKnowledgeMap.add(numbers[right])

            // 서로 다른 숫자가 maxDistinct를 초과하면 left 이동
            while (distinctKnowledgeMap.distinctCount > maxDistinct) {
                distinctKnowledgeMap.remove(numbers[left])
                left++
            }

            // 현재 구간에서 가능한 모든 부분배열 카운트
            result += (right - left + 1)
            right++
        }

        return result
    }

    data class DistinctKnowledgeMap(
        private val numberCount: MutableMap<Int, Int> = mutableMapOf()
    ) {
        val distinctCount: Int
            get() = numberCount.size

        fun add(number: Int) {
            numberCount[number] = numberCount.getOrDefault(number, 0) + 1
        }

        fun remove(number: Int) {
            val count = numberCount.getValue(number) - 1

            if (count == 0) {
                numberCount.remove(number)
            } else {
                numberCount[number] = count
            }
        }
    }
}
