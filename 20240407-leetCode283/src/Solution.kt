class Solution {
    //[0] => [0]
    //[0, 1] => [1, 0]
    //[1, 0] => [1, 0]
    //[0, 1, 0, 3, 12] => [1, 3, 12, 0, 0]
    //for (i: Int in nums.indices) if(nums[i]) == 0 {exchange(i, index, nums) }
    //exchage(i, index, nums) { if (index == nums.size) break val temp = nums[index + 1],nums[index + 1] = 0, nums[i] = temp}

    fun moveZeroes(nums: IntArray) {
        var current = 0

        while (current < nums.size) {
            if (nums[current] == 0) {
                val moved = toLast(current, nums)

                if (!moved) {
                    break
                }
            }

            current += 1
        }
    }

    private fun toLast(index: Int, nums: IntArray): Boolean {
        var nextIndex = index + 1

        if (nextIndex > nums.size - 1) {
            return false
        }

        var next = nums[nextIndex]

        while (next == 0 && nextIndex < nums.size - 1) {
            nextIndex += 1
            next = nums[nextIndex]
        }

        if (next == 0) {
            return false
        }

        val temp = nums[index]
        nums[index] = next
        nums[nextIndex] = temp

        return true
    }
}
