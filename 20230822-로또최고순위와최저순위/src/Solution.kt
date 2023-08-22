class Solution {
    fun solution(lottos: IntArray, winNumbers: IntArray): IntArray {
        val winNumber = winNumbers.toSet()

        return getRanking(match(lottos, winNumber))
    }

    fun getRanking(matched: IntArray): IntArray {
        return matched.map {
            when (it) {
                6 -> 1
                5 -> 2
                4 -> 3
                3 -> 4
                2 -> 5
                else -> 6
            }
        }.toIntArray()
    }

    fun match(lottos: IntArray, winNumber: Set<Int>): IntArray {
        return lottos.fold(intArrayOf(0, 0)) { result: IntArray, number: Int ->
            when {
                winNumber.contains(number) -> intArrayOf(result[0] + 1, result[1] + 1)
                number == 0 -> intArrayOf(result[0] + 1, result[1])
                else -> result
            }
        }
    }
}
