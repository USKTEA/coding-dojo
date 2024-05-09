class Solution {
    //[1, 4, 8, 13], 5 => 2
    //[1, 2, 4], 5 => 3
    fun maxFrequency(nums: IntArray, k: Int): Int {
        val sorted = nums.sorted()
        var left = 0
        var right = 0
        var answer = 0
        var current = 0

        while (right < sorted.size) {
            val target = sorted[right]
            current += target

            while ((right - left + 1) * target - current > k) {
                current -= sorted[left]
                left += 1
            }

            answer = Math.max(answer, right - left + 1)
            right += 1
        }
        
        return answer
    }
}
