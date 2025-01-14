class Solution {
    //[2,5,6], 10
    fun solve(numbers: ArrayList<Int>, maximum: Int): Int {
        var left = 0
        var right = 0
        var sum = 0
        var count = 0

        while (left <= numbers.lastIndex) {
            while (right <= numbers.lastIndex && sum + numbers[right] < maximum) {
                sum += numbers[right]
                right += 1
            }

            count += right - left

            if (right > left) {
                sum -= numbers[left]
            } else {
                right = left + 1
            }

            left += 1
        }

        return count
    }
}
