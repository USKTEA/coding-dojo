class Solution {
    //[2,3,5,1,3], 3 => [t, t, t, f, t]
    //[10, 1], 9 => [t, t]
    //[10, 1], 1 => [t, f]
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()

        return candies.map { candy ->
            return@map candy + extraCandies >= max
        }
    }
}
