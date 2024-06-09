import java.util.*

class Solution {

    //[4, 2, 7, 6, 9, 14, 12], 5, 1 => 4
    //[4, 12, 2, 7, 3, 18, 20, 3, 19], 10, 2 => 7
    //[1, 2, 3], 0, 0 => 0
    //[14, 3, 19, 3], 17, 0 => 3
    //current == height.lastIndex > return current
    //current = heights[current]
    //next = height[current + 1]
    //if (current >= next) {
    // return futhest( current + 1)
    // }
    //if bricks - (next -  curren) >= 0)
    //math.max(furthestBuilds(heights, brieks -)
    //ladder - 1


    fun furthestBuilding(
        heights: IntArray,
        bricks: Int,
        ladders: Int
    ): Int {
        val pq = PriorityQueue<Int>()
        var bricksRemaining = bricks

        for (i in 0 until heights.size - 1) {
            val climb = heights[i + 1] - heights[i]

            if (climb > 0) {
                pq.add(climb)
                if (pq.size > ladders) {
                    bricksRemaining -= pq.poll()
                }
                if (bricksRemaining < 0) {
                    return i
                }
            }
        }
        return heights.size - 1
    }
}

