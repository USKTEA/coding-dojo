class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        if (x < 10) {
            return true
        }

        val numbers = x.toString().map { it.digitToInt() }
        val pivot = getPivot(numbers)

        var left = pivot[0]
        var right = pivot[1]
        var leftCurrent = 0
        var rightCurrent = numbers.size - 1

        if (numbers.size == 2) {
            return numbers[left] == numbers[right]
        }

        while (leftCurrent <= left) {
            if (numbers[leftCurrent] != numbers[rightCurrent]) {
                return false
            }

            leftCurrent += 1
            rightCurrent -= 1
        }

        return true
    }

    fun getPivot(numbers: List<Int>): List<Int> {
        if (numbers.size % 2 == 0) {
            return listOf(numbers.size / 2 - 1, numbers.size / 2)
        }

        return listOf(numbers.size / 2, numbers.size / 2)
    }
}
