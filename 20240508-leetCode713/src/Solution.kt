class Solution {
    //[10, 5, 2, 6], 100 => 8
    //[1, 2, 3], 0 => 0
    //[1], 0 => 1
    //[0], 0 => 0
    //[1, 2], 3 => 3
    //naive
    //bruteForce
    //for for current < k
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        var totalCount = 0
        var product = 1
        var left = 0
        var right = 0

        if (k <= 1) {
            return 0
        }

        while (right < nums.size) {
            product *= nums[right]

            while (product >= k) {
                product /= nums[left]
                left += 1
            }

            totalCount += right - left + 1
            right += 1
        }

        return totalCount
    }
}
