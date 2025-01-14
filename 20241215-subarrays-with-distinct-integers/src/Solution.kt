class Solution {
    fun solve(numbers: ArrayList<Int>, destination: Int): Int {
        return subArrays(numbers, destination) - subArrays(numbers, destination - 1)
    }

    private fun subArrays(numbers: ArrayList<Int>, destination: Int): Int {
        val numberCount = mutableMapOf<Int, Int>()
        var left = 0
        var right = 0
        var sum = 0

        while (right <= numbers.lastIndex) {
            val currentNumber = numbers[right]

            val count = numberCount.getOrDefault(currentNumber, 0)
            numberCount[currentNumber] = count + 1

            while (numberCount.size > destination) {
                val count = numberCount.getValue(numbers[left])

                numberCount[numbers[left]] = count - 1

                if (numberCount[numbers[left]] == 0) {
                    numberCount.remove(numbers[left])
                }

                left += 1
            }

            sum += right - left + 1
            right += 1
        }

        return sum
    }
}
