class Solution {
    //[2, 5, 6], 10 => 4
    //result = 0
    //정수형 배열 numbers와 최대합의 수 destination이 주어졌을 때
    //numbers의 부분배열의 합이 destination보다 적은 부분배열의 갯수를 구하라
    //left =0 , right = 0, left <= numbers.lastIndex, right <= numbers.lastIndex && sum + numbers[right] < dstintaion {
    // sum += numbers[right]
    // right += 1
    // }
    //result += right - left + 1
    //if (right > left) {
    //  sum -= numbers[right] right -= 1
    // }
    //
    // if (right == left) { left += 1 , right = left}
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

            if (right > left) {
                sum -= numbers[left]
                left += 1
                continue
            }

            if (right == left) {
                left += 1
                right = left
            }
        }

        return result
    }
}
