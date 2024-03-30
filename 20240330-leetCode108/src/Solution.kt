class Solution {
    //[1] => [1]
    //[1, 3] => [1, 3] || [3, 1]
    //[-10, -3, 0, 5, 9] => [0, -3, 9, -10, null, 5] || [0, -10, 5, null, -3, null, 9]
    // [-10, -3, 0, 5, 9]
    // getPivotIndex(nums) => nums.size / 2
    //
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return toBst(nums, 0, nums.lastIndex)
    }

    private fun toBst(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) {
            return null
        }

        val mid = (start + end) / 2

        return TreeNode(nums[mid]).apply {
            left = toBst(nums, start, mid - 1)
            right = toBst(nums, mid + 1, end)
        }
    }
}

data class TreeNode(
    val `val`: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null,
)
