class Solution {
    //[1], 0 => 0
    //[1], 1 => 0
    //[1], 2 => 1
    //[1, 3, 5, 6], 5 => 2
    //[1, 3, 5, 6], 7 => 4

    fun searchInsert(nums: IntArray, target: Int, left: Int = 0, right: Int = nums.size - 1): Int {
        if (left > right) {
            return left
        }

        val mid = left + (right - left) / 2

        return when {
            nums[mid] == target -> mid
            nums[mid] < target -> searchInsert(nums, target, mid + 1, right)
            else -> searchInsert(nums, target, left, mid - 1)
        }
    }
}
