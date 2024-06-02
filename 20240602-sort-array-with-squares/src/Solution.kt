class Solution {
    //[-6, -3, -1, 2, 4, 5] => [1, 4, 9, 16, 25, 36]

    //모두 제곱을 때린다
    //기수정렬
    //addToSet
    //return set.toArrayList()
    fun solve(numbers: ArrayList<Int>): ArrayList<Int> {
        val sorted = radixSort(numbers.map { it * it })

        return ArrayList(sorted)
    }

    fun radixSort(numbers: List<Int>): List<Int> {
        var radix = 0
        val maxRadix = numbers.max().toString().length
        var sortedNumbers = numbers

        while (radix <= maxRadix) {
            val buckets = Array(10) { mutableListOf<Int>() }

            sortedNumbers.forEach { number ->
                val radixNumber = radixNumber(number, radix)
                buckets[radixNumber].add(number)
            }

            val newSortedNumbers = buckets.flatMap { it }

            if (newSortedNumbers == sortedNumbers) {
                break
            }

            sortedNumbers = newSortedNumbers
            radix += 1
        }

        return sortedNumbers
    }

    private fun radixNumber(number: Int, radix: Int): Int {
        val numberString = number.toString()
        return (numberString.getOrNull(numberString.lastIndex - radix) ?: '0').digitToInt()
    }
}
