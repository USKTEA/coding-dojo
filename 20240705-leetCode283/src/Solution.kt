class Solution {
    //[0, 1, 0, 3, 12] => [1, 3, 12 , 0, 0]
    //[0] => [0]
    //[1] => [1]
    //[1, 0] => [1, 0]
    //[0, 1] => [1, 0]
    //[0, 0, 1] => [1, 0, 0]
    fun moveZeroes(nums: IntArray) {
        val nonZeros = mutableListOf<Int>()
        var zeroCount = 0
        for (num in nums) {
            if (num != 0) {
                nonZeros.add(num)
            }

            if (num == 0) {
                zeroCount += 1
            }
        }

        nonZeros.forEachIndexed { index, number ->
            nums[index] = number
        }

        for (i: Int in nonZeros.size..nums.lastIndex) {
            nums[i] = 0
        }
    }
}
