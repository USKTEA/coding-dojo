class Solution {
    //[1] => 1
    //[1, 2] => 3
    //[1, 2, -1] => 3
    //[1, -2, 1] => 1
    //[1, -2, 0, 2] => 2
    //[1, 2, -1, 5] => 7
    //[5, 4, -1, 7, 8] => 23
    //max, current, start, end
    //for(i: int in nums.indices) {
    // if (nums[i] >= 0) {
    // current += nums[i]
    // if (current > max) {
    // max = current
    // end = i
    // }
    // }
    // if (nums[i] < 0) {
    // current -= nums[i]
    // }
    // }
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var current = nums[0]

        for (i in 1 until nums.size) {
            current = Math.max(nums[i], current + nums[i])
            max = Math.max(max, current)
        }

        return max
    }
}
