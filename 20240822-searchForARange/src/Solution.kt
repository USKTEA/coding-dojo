import kotlin.math.max
import kotlin.math.min

class Solution {
    //[5, 7, 7, 8, 8, 10], 8 => [3, 4]
    //middle값이 toFind보다 크다면 좌측으로, 작다면 우측으로
    //middle값이 toFind와 일치하면 좌우로 이진탐색을 한다
    //middle값이 toFind와 일치하면 min과 max를 업데이트 한다
    fun searchRange(numbers: List<Int>, toFind: Int): ArrayList<Int> {
        return search(numbers, toFind, 0, numbers.lastIndex, arrayListOf(-1, -1))
    }

    private fun search(numbers: List<Int>, toFind: Int, start: Int, end: Int, result: ArrayList<Int>): ArrayList<Int> {
        if (start > end) {
            return result
        }

        val middle = start + (end - start) / 2
        val currentNumber = numbers[middle]

        if (currentNumber > toFind) {
            return search(numbers, toFind, start, middle - 1, result)
        }

        if (currentNumber < toFind) {
            return search(numbers, toFind, middle + 1, end, result)
        }

        if (result[0] == -1) {
            result[0] = middle
        }

        result[0] = min(result[0], middle)
        result[1] = max(result[1], middle)

        search(numbers, toFind, start, middle - 1, result)
        search(numbers, toFind, middle + 1, end, result)

        return result
    }
}
