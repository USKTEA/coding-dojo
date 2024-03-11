class Solution {

    // [1, 2], 0 => 0, [1, 2]
    // [], 1 => 0, []
    // [1], 1 => 1, [51]
    // [1, 2, 3], 1 => 1, [2, 3, 51]
    fun removeElement(nums: IntArray, toRemove: Int): Int {
        val a = nums.foldIndexed(nums) { index: Int, acc: IntArray, i: Int ->
            if (i == toRemove) {
                acc[index] = DELETED
                return@foldIndexed acc
            }

            acc
        }.count { it != DELETED }

        nums.sort()

        return a
    }

    companion object {
        private const val DELETED = 51
    }
}
