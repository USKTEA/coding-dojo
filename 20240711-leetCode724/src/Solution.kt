class Solution {
    //[1, 7, 3, 6, 5, 6], 3 => 3
    fun pivotIndex(nums: IntArray): Int {
        var left = 0
        var right = nums.sum()
        var index = 0

        while (index <= nums.lastIndex) {
            right -= nums[index]

            if (left == right) {
                return index
            }

            left += nums[index]
            index += 1
        }

        return -1
    }
}
