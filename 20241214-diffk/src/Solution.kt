class Solution {
    fun diffPossible(numbers: ArrayList<Int>, destination: Int): Int {
        var currentIndex = 0

        while (currentIndex < numbers.lastIndex) {
            var left = currentIndex + 1
            var right = numbers.lastIndex

            while (left <= right) {
                val mid = left + (right - left) / 2
                val difference = numbers[mid] - numbers[currentIndex]

                if (difference == destination) {
                    return 1
                }

                if (difference > destination) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }

            currentIndex += 1
        }

        return 0
    }
}
