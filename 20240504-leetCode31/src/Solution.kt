class Solution {
    //[1, 2, 3] => [1, 3, 2]
    //[3, 2, 1] => [1, 2, 3]
    //val currentIndex = nums.lastIndex
    //val sortedNumber = nums.sorted()
    //while (currentIndex > 0) {
    // if (currentIndex == nums.lastIndex) {
    // val lastNumber = nums[lastIndex]
    // for (nums) {
    // val bigger = sorted.firstOrNull { it > lastNumber }
    // if (bigger == null) {
    //  sorted.last()
    // }
    // }
    // val number = nums
    // }
    // }
    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.size - 2

        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i -= 1
        }

        if (i >= 0) {
            var j = nums.size - 1
            while (nums[j] <= nums[i]) {
                j -= 1
            }
            swap(nums, i, j)
        }

        reverse(nums, i + 1)
    }

    private fun reverse(intArray: IntArray, start: Int) {
        var start = start
        var end = intArray.lastIndex

        while (start < end) {
            intArray.reverse()
            swap(intArray, start, end)
            start += 1
            end -= 1
        }
    }

    private fun swap(intArray: IntArray, i: Int, j: Int) {
        val temp = intArray[i]
        intArray[i] = intArray[j]
        intArray[j] = temp
    }
}
