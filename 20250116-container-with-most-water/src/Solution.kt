import kotlin.math.min

class Solution {
    //[1, 5, 4, 3] => 6
    fun maxArea(heights: ArrayList<Int>): Int {
        var left = 0
        var right = heights.lastIndex
        var maxArea = 0

        while (left < right) {
            maxArea =  maxOf(maxArea, min(heights[right], heights[left]) * (right - left))

            when (heights[left] > heights[right]) {
                true -> right -= 1
                false -> left += 1
            }
        }

        return maxArea
    }
}
