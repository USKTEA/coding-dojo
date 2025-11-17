class Solution {
    //정렬
    //세 배열 중 가장 작은 요소를 기준으로
    //다른 두 배열에 해당 요소보다 큰 것이 나올 때 까지 반복
    //만약 동일한 요소가 다른 배열에 존재한다면 numberCount += 1
    //만약 2개의 배열이 마지막이라면 끝
    fun solve(
        numbers: ArrayList<Int>,
        otherNumbers: ArrayList<Int>,
        theOtherNumbers: ArrayList<Int>,
    ): ArrayList<Int> {
        val sortedNumbers = numbers.sorted()
        val otherSortedNumbers = otherNumbers.sorted()
        val theOtherSortedNumbers = theOtherNumbers.sorted()

        var sortedNumberIndex = 0
        var otherSortedNumberIndex = 0
        var theOtherSortedNumberIndex = 0

        val result = arrayListOf<Int>()

        while (sortedNumberIndex < sortedNumbers.size && otherSortedNumberIndex < otherSortedNumbers.size && theOtherSortedNumberIndex < theOtherSortedNumbers.size) {
            val sortedNumberMin = sortedNumbers[sortedNumberIndex]
            val otherSortedNumberMin = otherSortedNumbers[otherSortedNumberIndex]
            val theOtherSortedNumberMin = theOtherSortedNumbers[theOtherSortedNumberIndex]

            if (sortedNumberMin == otherSortedNumberMin && otherSortedNumberMin == theOtherSortedNumberMin) {
                result.add(sortedNumberMin)

                sortedNumberIndex += 1
                otherSortedNumberIndex += 1
                theOtherSortedNumberIndex += 1

                continue
            }

            val minVal = minOf(sortedNumberMin, otherSortedNumberMin, theOtherSortedNumberMin)

            if (sortedNumberMin == minVal) {
                sortedNumberIndex += 1
            }

            if (otherSortedNumberMin == minVal) {
                otherSortedNumberIndex += 1
            }

            if (theOtherSortedNumberMin == minVal) {
                theOtherSortedNumberIndex += 1
            }
        }

        return result
    }
}
