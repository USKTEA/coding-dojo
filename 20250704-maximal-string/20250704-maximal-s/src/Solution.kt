class Solution {

    //0-9까지 숫자로 이루어진 문자열 numbers가 주어졌을 때 각 요소를 최대 maxSwap만큼 교체했을 때
    //사전순으로 가장 큰 숫자가 나오는 함수를 구현해라.
    fun solve(numbers: String, maxSwap: Int): String {
        var result = StringBuilder("")
        val current = StringBuilder(numbers)

        fun backTracking(index: Int, swap: Int) {
            if (current > result) {
                result = StringBuilder(current)
            }

            if (index > numbers.lastIndex || swap == 0) {
                return
            }

            (index + 1..numbers.lastIndex).forEach { currentIndex ->
                val base = current[index]
                val toSwap = current[currentIndex]

                if (base >= toSwap) {
                    backTracking(index + 1, swap)
                }

                if (base < toSwap) {
                    swap(current, index, currentIndex)
                    backTracking(index + 1, swap - 1)
                    swap(current, currentIndex, index)
                }
            }
        }

        backTracking(0, maxSwap)

        return result.toString()
    }

    private fun swap(current: StringBuilder, index: Int, currentIndex: Int) {
        val temp = current[index]

        current[index] = current[currentIndex]
        current[currentIndex] = temp
    }
}
