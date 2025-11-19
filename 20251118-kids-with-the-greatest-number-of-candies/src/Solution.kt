class Solution {
    //정수형 배열 candies 와 전수 extraCandies가 주어쪘을 때 candies[i] + extraCandies >= candies.max() 라면 true 아니면 false
    //불리언 배열 결과를 반환해라
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        if (candies.isEmpty()) {
            return emptyList()
        }

        val maxCandy = candies.max()

        return candies.map { candy ->
            candy + extraCandies >= maxCandy
        }
    }
}
