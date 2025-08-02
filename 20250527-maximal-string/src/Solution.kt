class Solution {
    fun solve(input: String, maxSwaps: Int): String {
        var answer = CharArray(input.length)
        val current = input.toCharArray()

        fun backTracking(input: String, swapRemains: Int, index: Int) {
            if (current.joinToString("") > answer.joinToString("")) {
                answer = current.copyOf()
            }

            val maxValue = current.slice(index..<input.length).max()

            if (swapRemains == 0 || index > input.lastIndex) {
                return
            }

            if (maxValue == current[index]) {
                backTracking(input, swapRemains, index + 1)
            }

            if (maxValue != input[index]) {
                for (i in input.length - 1 downTo  index + 1) {
                    if (current[i] == maxValue ) {
                        swap(current, index, i)
                        backTracking(input, swapRemains - 1, index + 1)
                        swap(current, index, i)
                    }
                }
            }
        }

        backTracking(input, maxSwaps, 0)

        return answer.joinToString("")
    }

    fun swap(charArray: CharArray, index: Int, maxIndex: Int) {
        val temp = charArray[index]

        charArray[index] = charArray[maxIndex]
        charArray[maxIndex] = temp
    }
}
