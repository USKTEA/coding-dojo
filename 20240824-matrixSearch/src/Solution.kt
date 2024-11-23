class Solution {
    //[[1, 3, 4, 7], [10, 11, 16, 20], [23, 30, 34, 50]], 3 => 1
    //matrix를 이진탐색 한다. middleArray.
    //middleArray를 찾고 middleArray 기준으로 다시 이진탐색한다
    //만약 middleArray에서 start > index라면
    //matrix 인덱스 기준으로 middleArray를 호출한다
    //toFind가 last보다 크다면 우측, 작다면 좌측
    fun searchMatrix(matrix: ArrayList<ArrayList<Int>>, toFind: Int): Int {
        return searchMatrix(matrix, toFind, 0, matrix.lastIndex)
    }

    private fun searchMatrix(matrix: ArrayList<ArrayList<Int>>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return 0
        }

        val middle = start + (end - start) / 2
        val first = matrix[middle].first()
        val last = matrix[middle].last()

        if (first == toFind || last == toFind) {
            return 1
        }

        if (first < toFind && last > toFind) {
            return search(matrix[middle], toFind, 0, matrix[middle].lastIndex)
        }

        if (first > toFind) {
            return searchMatrix(matrix, toFind, start, middle - 1)
        }

        return searchMatrix(matrix, toFind, middle + 1, end)
    }

    private fun search(numbers: ArrayList<Int>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return 0
        }

        val middle = start + (end - start) / 2

        if (numbers[middle] == toFind) {
            return 1
        }

        if (numbers[middle] > toFind) {
            return search(numbers, toFind, start, middle - 1)
        }

        return search(numbers, toFind, middle + 1, end)
    }
}
