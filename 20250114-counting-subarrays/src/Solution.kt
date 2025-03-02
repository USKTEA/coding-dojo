class Solution {
    //[2, 5, 6], 10 => 4
    //left = 0, right = 0
    //sum = 0
    //left <= numbers.lastIndex
    //right = left
    //sum += right
    //if (sum < destination) {
    // count += 1
    // }
    //while (sum >= destination) {
    // left += 1
    // if (left == right) {
    //
    // }
    // }
    //
    fun solve(numbers: ArrayList<Int>, destination: Int): Int {
        var left = 0
        var right = 0
        var sum = 0
        var result = 0

        while (left <= numbers.lastIndex) {
            while (right <= numbers.lastIndex && sum + numbers[right] < destination) {
                sum += numbers[right]
                right += 1
            }

            result += right - left

            when (left < right) {
                true -> sum -= numbers[left]
                false -> right = left + 1
            }

            left += 1
        }

        return result
    }
}
