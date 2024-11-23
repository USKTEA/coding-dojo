class Solution {
    //[4, 5, 6, 7, 0, 1, 2, 3], 4 => 0
    //중간점인 pivot을 찾는다
    //0 ~ pivot(included), pivot ~ lastIndex를 바이너리서치로 toFind의 index를 찾는다
    //pivot ~ lastIndex에서 찾았다면 index에 pivot을 더한다
    //없다면 -1 반환
    fun search(numbers: List<Int>, toFind: Int): Int {
        val pivot = searchPivotIndex(numbers)
        val leftResult = searchNumber(numbers, 0, pivot, toFind)

        if (leftResult != -1) {
            return leftResult
        }

        val rightResult = searchNumber(numbers, pivot, numbers.lastIndex, toFind)

        return rightResult
    }

    fun searchNumber(numbers: List<Int>, start: Int, end: Int, toFind: Int): Int {
        if (start > end) {
            return -1
        }

        val middle = start + (end - start) / 2

        val middleNumber = numbers[middle]

        if (middleNumber > toFind) {
            return searchNumber(numbers, start, middle - 1, toFind)
        }

        if (middleNumber < toFind) {
            return searchNumber(numbers, middle + 1, end, toFind)
        }

        return middle
    }


    fun searchPivotIndex(numbers: List<Int>): Int {
        if (numbers.first() <= numbers.last()) {
            return 0
        }

         return searchPivot(numbers, 0, numbers.lastIndex)
    }

    private fun searchPivot(numbers: List<Int>, start: Int, end: Int): Int {
        if (start >= end) {
            return start
        }

        val middle = start + (end - start) / 2

        if (middle < end && numbers[middle] > numbers[middle + 1]) {
            return middle + 1
        }

        if (numbers[start] > numbers[middle]) {
            return searchPivot(numbers, start, middle)
        }

        return searchPivot(numbers, middle + 1, end)
    }
}
