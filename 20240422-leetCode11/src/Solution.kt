import kotlin.math.max
import kotlin.math.min

class Solution {
    //[1, 8, 5, 2, 5, 4, 8, 3, 7] => 49
    //[1, 1] => 1
    //[0, 0] => 0
    //[0, 1] => 0
    //[1, 0] => 0
    //[1, 1, 1] => 2
    //for (i: Int in 0..heigit.indices) {
    //for (j: Int in i..height.indices){
    // val amount = min(i, j) * j - i
    // var maxAmount = max(maxAmount, amount(
    // }
    // }
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxAmount = 0

        while (left < right) {
            val amount = min(height[left], height[right]) * (right - left)
            maxAmount = max(maxAmount, amount)

            if (height[left] > height[right]) {
                right -= 1

                continue
            }

            left += 1
        }

        return maxAmount
    }
}
