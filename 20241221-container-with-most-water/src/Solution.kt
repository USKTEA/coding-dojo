import kotlin.math.truncate

class Solution {
    fun maxArea(heights: ArrayList<Int>): Int {
        var left = 0
        var right = 1
        var max = 0

        while (left < heights.lastIndex) {
            while (right <= heights.lastIndex) {
                max = maxOf(max, area(heights, left, right))
                right += 1
            }

            var nextLeft = left + 1

            while (nextLeft <= heights.lastIndex) {
                if (heights[nextLeft] > heights[left]) {
                    left = nextLeft
                    right = nextLeft + 1

                    break
                }

                nextLeft += 1
            }

            if (nextLeft == right) {
                left = right
            }
        }

        return max
    }

    fun area(heights: ArrayList<Int>, left: Int, right: Int): Int {
        return (right - left) * minOf(heights[left], heights[right])
    }
}
