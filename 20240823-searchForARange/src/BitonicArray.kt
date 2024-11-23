import kotlin.math.max

class BitonicArray {

    //[3, 9, 10 , 20 ,17, 5, 1], 20 => 3
    //bitonicArray는 즘가 -> 감소로 되어 있는 배열이다
    //이진탐색으로 좌측이 나보다 작고 우측이 나보다 작은 peak를 찾는다
    //peak를 포함한 좌측 배열 이진탐색, peak를 포함항 우측 배열 이진탐색 + peak의 index 추가
    //toFind를 찾았다면 인덱스를 반환한다
    fun solve(numbers: ArrayList<Int>, toFind: Int): Int {
        if (numbers.size == 1) {
            return 0
        }

        val peakIndex = searchPeakIndex(numbers, 0, numbers.lastIndex)

        val leftResult = search(numbers, toFind, 0, peakIndex)

        if (leftResult != - 1) {
            return leftResult
        }

        return search(numbers, toFind, peakIndex, numbers.lastIndex)
    }

    private fun search(numbers: ArrayList<Int>, toFind: Int, start: Int, end: Int): Int {
        if (start > end) {
            return -1
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

    fun searchPeakIndex(numbers: ArrayList<Int>, start: Int, end: Int): Int {
        if (start > end) {
            return start
        }

        val middle = start + (end - start) / 2

        if (middle == 0) {
            if (numbers[middle] > numbers[middle + 1]) {
                return middle
            }

            return middle + 1
        }

        if (middle == numbers.lastIndex) {
            if (numbers[middle] > numbers[middle - 1]) {
                return middle
            }

            return middle - 1
        }

        if (numbers[middle] > numbers[middle -1] && numbers[middle] > numbers[middle + 1]) {
            return middle
        }

        val left = searchPeakIndex(numbers, start, middle - 1)
        val right = searchPeakIndex(numbers, middle + 1, end)

        return max(left, right)
    }
}
