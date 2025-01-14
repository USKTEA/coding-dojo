class Solution {
    fun diffPossible(numbers: ArrayList<Int>, destination: Int): Int {
        var currentIndex = 0

        while (currentIndex < numbers.lastIndex) {
            var left = currentIndex + 1
            var right = numbers.lastIndex

            while (left <= right) {
                val middle = left + (right - left) / 2
                val diff = numbers[middle] - numbers[currentIndex]

                when {
                    diff == destination -> return 1
                    diff > destination -> right = middle - 1
                    else -> left = middle + 1
                }
            }

            currentIndex += 1
        }

        return 0
    }
}
