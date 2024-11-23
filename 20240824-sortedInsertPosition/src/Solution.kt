class Solution {
    //[1, 3, 5, 6], 5 => 2
    //numbers를 이진탐색해서 중간 값이 toFind와 일치하는지 확인 일치하면 중감 값 인덱스 반환
    //없을 경우 중간 값이 toFind보다 크다면 좌측 이진탐색, 작다면 우측 이진 탐색
    //start > end까지 진행하고 start를 반환한다
    fun searchInsert(numbers: ArrayList<Int>, toFind: Int): Int {
        return search(numbers, toFind, 0, numbers.lastIndex)
    }

    private fun search(numbers: ArrayList<Int>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return start
        }

        val middle = start + (end - start) / 2

        if (numbers[middle] == toFind) {
            return middle
        }

        if (numbers[middle] > toFind) {
            return search(numbers, toFind, start, middle - 1)
        }

        return search(numbers, toFind, middle + 1, end)
    }
}
