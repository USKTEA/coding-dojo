class Solution {
    fun solve(numbers: ArrayList<Int>, destination: Int): Int {
        var left = 0
        var right = 0
        var sum = 0
        var count = 0

        while (left <= numbers.lastIndex) {
            while (right <= numbers.lastIndex && sum + numbers[right] < destination) {
                sum += numbers[right]
                right += 1
            }

            count += (right - left)

            if (right > left) {
                sum -= numbers[left]
            }  else {
                right = left + 1
            }

            left += 1
        }

        return count
    }
}
