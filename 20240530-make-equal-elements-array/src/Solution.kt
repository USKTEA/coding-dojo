class Solution {
    //[2, 3, 1], 1 => 1,
    //[2, 3, 1], 2 => 0
    //[0, 0, 0], 1 => 1
    //sort
    //first + extra = last || last - extra
    //return 1
    fun solve(numbers: ArrayList<Int>, extraNumber: Int): Int {
        val sortedDistinctNumbers = numbers.toSet().sorted()
        val middle = getMiddleNumber(sortedDistinctNumbers)
        val first = sortedDistinctNumbers.first()
        val last = sortedDistinctNumbers.last()

        if (first == middle && last == middle) {
            return 1
        }

        if (first + extraNumber == middle && last - extraNumber == middle) {
            return 1
        }

        return 0
    }

    fun getMiddleNumber(sortedDistinctNumbers: List<Int>): Int {
        val middle = (0 + sortedDistinctNumbers.lastIndex) / 2

        return sortedDistinctNumbers[middle]
    }
}
