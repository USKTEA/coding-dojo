import java.util.SortedSet

class Solution {
    fun solve(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>, theOtherNumbers: ArrayList<Int>): ArrayList<Int> {
        val sortedNumbers = numbers.toSet()
        val otherSortedNumbers = otherNumbers.toSet()
        val theOtherSortedNumbers = theOtherNumbers.toSet()

        val sortedNumberOtherSortedNumberInnerJoin = innerJoin(sortedNumbers, otherSortedNumbers)
        val sortedNumberTheOtherSortedNumberInnerJoin = innerJoin(sortedNumbers, theOtherSortedNumbers)
        val otherSortedNumberTheOtherSortedNumberInnerJoin = innerJoin(otherSortedNumbers, theOtherSortedNumbers)

        return ArrayList((sortedNumberOtherSortedNumberInnerJoin + sortedNumberTheOtherSortedNumberInnerJoin + otherSortedNumberTheOtherSortedNumberInnerJoin).sorted())
    }

    private fun innerJoin(sortedNumbers: Set<Int>, otherSortedNumbers: Set<Int>): Set<Int> {
        return sortedNumbers.intersect(otherSortedNumbers)
    }
}

