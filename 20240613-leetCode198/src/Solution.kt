import kotlin.math.max

class Solution {
    //[1, 2, 3, 1] => 4
    //[2, 7, 9, 3, 1] => 12

    //[1] => 1
    //[2] => 2
    //[1, 2, 3] => 4
    //[1, 2, 3, 4] => 6
    //[2, 10, 2] => 10
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) return max(nums[0], nums[1])

        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])

        for (i in 2 until nums.size) {
            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        }

        return dp[nums.size - 1]
    }
}
