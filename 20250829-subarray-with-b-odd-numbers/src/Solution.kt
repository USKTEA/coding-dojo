class Solution {
    fun solve(numbers: ArrayList<Int>, oddNumbers: Int): Int {
        return subArrays(numbers, oddNumbers) - subArrays(numbers, oddNumbers - 1)
    }

    private fun subArrays(numbers: ArrayList<Int>, oddNumbers: Int): Int {
        if (oddNumbers < 0) {
            return 0
        }

        var result = 0
        var left = 0
        var right = 0
        var oddCounts = 0

        while (right <= numbers.lastIndex) {
            val number = numbers[right]

            if (number % 2 != 0) {
                oddCounts += 1
            }

            while (oddCounts > oddNumbers) {
                if (numbers[left] % 2 != 0) {
                    oddCounts -= 1
                }
                left += 1
            }

            result += right - left + 1
            right += 1
        }

        return result
    }
}
