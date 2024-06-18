import kotlin.math.max

class Solution {
    //[1, 2, 3, 1] => 4
    //[2, 7, 9, 3, 1] => 12

    //[1] => 1
    //[2] => 2
    //[1, 2, 3] => 4
    //[1, 2, 3, 4] => 6
    //[2, 10, 2] => 10
    fun rob(nums: IntArray, index: Int = 0, money: Int = 0): Int {
        if (nums.isEmpty()) {
            return  0
        }

        if (nums.size <= 2) {
            return nums.max()
        }

        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])

        for (i in 2..nums.lastIndex) {
            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        }

        return dp[nums.lastIndex]
    }
}
