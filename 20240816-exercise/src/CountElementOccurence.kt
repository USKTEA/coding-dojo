class CountElementOccurrence {
    //[5, 7, 7, 8, 8, 10], 7 => 2
    fun findCount(numbers: List<Int>, toFind: Int): Int {
        if (numbers.isEmpty()) {
            return 0
        }

        return count(numbers, toFind, 0, numbers.lastIndex)
    }

    private fun count(numbers: List<Int>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return 0
        }

        val middle = start + (end - start) / 2

        if (numbers[middle] == toFind) {
            return 1 + count(numbers, toFind, start, middle - 1) + count(numbers, toFind, middle + 1, end)
        }

        if (numbers[middle] > toFind) {
            return count(numbers, toFind, start, middle - 1)
        }

        return count(numbers, toFind, middle + 1, end)
    }
}
