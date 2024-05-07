class Solution {
    //[1, 2, 3, 1] => 2
    //[1, 2, 1, 3, 5, 6, 4] => 1 || 5
    //[1] => 0
    //[1, 2] => 1
    //[1, 2, 3] => 2
    //
    fun findPeakElement(nums: IntArray): Int {
        return binarySearch(nums, 0, nums.lastIndex)
    }

    private fun binarySearch(numbers: IntArray, left: Int, right: Int): Int {
        if (left == right) {
            return left
        }

        val mid = (left + right) / 2

        if (numbers[mid] > numbers[mid + 1]) {
            return binarySearch(numbers, left, mid)
        }

        return binarySearch(numbers, mid + 1, right)
    }
}
