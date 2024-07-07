import kotlin.math.max
import kotlin.math.min

class Solution {
    //[1, 8, 6, 2, 5, 4, 8, 3, 7] => 49
    //[1, 1] => 1
    //for 돌아 돌아 if ((index, height) * (index, height)) > 뒤에 오는거
    //for 돌아서 Max 구하고 index만 뽑아 먹는다
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.lastIndex
        var maxArea = 0

        while (left <= right) {
            val width = right - left
            val height = min(heights[left], heights[right])

            maxArea = max(maxArea, width * height)

            if (heights[left] <= heights[right]) {
                left += 1

                continue
            }

            right -= 1
        }

        return maxArea
    }
}

