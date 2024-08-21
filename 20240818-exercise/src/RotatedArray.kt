import kotlin.math.min

class RotatedArray {
    //[4, 5, 6, 7, 1, 2] => 1
    fun findMin(rotatedArray: List<Int>): Int {
        return find(rotatedArray, 0, rotatedArray.lastIndex)
    }

    private fun find(rotatedArray: List<Int>, start: Int, end: Int): Int {
        if (rotatedArray[start] <= rotatedArray[end]) {
            return rotatedArray[start]
        }

        if (end - start <= 1) {
            return min(rotatedArray[start], rotatedArray[end])
        }

        val middle = start + (end - start) / 2

        if (rotatedArray[start] <= rotatedArray[end]) {
            return find(rotatedArray, start, middle)
        }

        return find(rotatedArray, middle, end)
    }
}
