class Solution {
    //[1, 2, 3, 4] => [24, 12, 8, 6]
    //[-1, 1, 0, -3, 3] => [0, 0, 9, 0, 0]
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var left = 1
        val cache = mutableMapOf<Int, Int>()

        for (i: Int in nums.indices) {
            if (i != 0) {
                left *= nums[i - 1]
            }

            if (cache[nums[i]] != null) {
                result[i] = cache.getValue(nums[i])

                continue
            }

            var current = 1

            for (j: Int in i + 1 ..< nums.size) {
                current *= nums[j]
            }

            cache[nums[i]] = current * left
            result[i] = current * left
        }

        return result
    }
}
