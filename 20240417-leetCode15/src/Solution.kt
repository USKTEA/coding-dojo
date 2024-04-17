class Solution {
    //[-1, 0, 1, 2, -1, -4] => [[-1, -1, 2], [-1, 0, 1]]
    //[0, 1, 1] => []
    //[0, 0, 0] => [[0, 0, 0]]
    //[0, 1, -1] => [[0, 1, -1]]
    //for(i in 0..nums.indices) for(j in i..nums.indices) for(y in y..nums.indices)
    //if nums[i] + nums[j] + nums[y] == 0 add(List<Sum>, Sum(1, 2, 3)
    //return sums.map { sum.toList
    fun threeSum(nums: IntArray): List<List<Int>> {
        val ans = mutableSetOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size-2){
            var left = i + 1
            var right = nums.size-1
            while (left < right){

                val sum = nums[i] + nums[left] + nums[right]

                if (sum == 0){
                    ans.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                }

                else if (sum < 0) left++

                else right--
            }
        }
        return ans.toList()
    }
}
