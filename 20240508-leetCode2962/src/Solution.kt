class Solution {
    //[1, 3, 2, 3, 3], 2 => 6
    //[1, 4, 2, 1], 3 => 0
    //val biggestNumber = nums.sorted().last

    fun countSubarrays(nums: IntArray, k: Int): Long {
        val biggestNumber = nums.maxOf { it }
        val biggestNumberIndexes = ArrayDeque<Int>()
        var left = 0
        var right = 0
        var count = 0
        var result = 0L

        while (right < nums.size) {
            if (nums[right] == biggestNumber) {
                count += 1
                biggestNumberIndexes.add(right)

                if (count >= k) {
                    left = biggestNumberIndexes.removeFirst() + 1
                }
            }

            result += left
            right += 1
        }

        return result
    }
}
