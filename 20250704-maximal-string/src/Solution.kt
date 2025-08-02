class Solution {

    fun solve(input: String, maxSwaps: Int): String {
        var result = ""
        var current = input

        fun backTracking(index: Int, maxSwaps: Int) {
            if (current > result) {
                result = current
            }

            if (maxSwaps == 0 || index > input.lastIndex) {
                return
            }

            (index + 1..input.lastIndex).forEach { currentIndex ->
                val base = current[index]
                val toChange = current[currentIndex]

                if (base >= toChange) {
                    backTracking(index + 1, maxSwaps)
                }

                if (base < toChange) {
                    current = exchange(current, index, currentIndex)
                    backTracking(index + 1, maxSwaps - 1)
                    current = exchange(current, currentIndex, index)
                }
            }
        }

        backTracking(0, maxSwaps)

        return result
    }

    private fun exchange(word: String, index: Int, currentIndex: Int): String {
        val charArray = word.toCharArray()
        val temp = charArray[index]

        charArray[index] = charArray[currentIndex]
        charArray[currentIndex] = temp
        return charArray.joinToString("")
    }
}
