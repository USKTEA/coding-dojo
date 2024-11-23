import kotlin.math.max
import kotlin.math.min

class Solution {
    //[5, 7, 7, 8, 8, 10], 8 => [3, 4]
    //toFind와 일치하는 숫자를 찾을 때 까지 이진탐색 한다
    //toFind와 일치하면 range의 첫 번째는 -1라면 무조건 변경, 나머지는 min, max
    //start >= end 까지 반복
    fun searchRange(numbers: List<Int>, toFind: Int): ArrayList<Int> {
        return search(numbers, toFind, 0, numbers.lastIndex, arrayListOf(-1, -1))
    }

    private fun search(
        numbers: List<Int>,
        toFind: Int,
        start: Int,
        end: Int,
        range: ArrayList<Int>
    ): ArrayList<Int> {
        if (start > end) {
            return range
        }

        val middle = start + (end - start) / 2

        if (numbers[middle] > toFind) {
            return search(numbers, toFind, start, middle - 1, range)
        }

        if (numbers[middle] < toFind) {
            return search(numbers, toFind, middle + 1, end, range)
        }

        if (range[0] == -1) {
            range[0] = middle
        }

        range[0] = min(range[0], middle)
        range[1] = max(range[1], middle)

        search(numbers, toFind, start, middle - 1, range)
        search(numbers, toFind, middle + 1, end, range)

        return range
    }
}
