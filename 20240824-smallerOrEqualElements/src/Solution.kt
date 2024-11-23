class Solution {
    //[1, 3, 4, 4, 6], 4 => 4
    //numbers start 0 end numbers.lastIndex로 이진탐색
    //toFind보다 크다면 좌측 부분을 이진탐색
    //toFind와 작거나 같다면 우로 이진탐색
    //start > end까지 탐색
    //start + 1반환
    fun solve(numbers: ArrayList<Int>, toFind: Int): Int {
        return search(numbers, toFind, 0, numbers.lastIndex)
    }

    private fun search(numbers: ArrayList<Int>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return start
        }

        val middle = start + (end - start) / 2

        if (numbers[middle] > toFind) {
            return search(numbers, toFind, start, middle - 1)
        }

        return search(numbers, toFind, middle + 1, end)
    }
}
