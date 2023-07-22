class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val start = intArrayOf(0, 0)
        val end = intArrayOf(0, 0)

        val answer = wallpaper.foldIndexed(arrayOf(start, end)) { rowIndex, positions, row ->
            row.split("").forEachIndexed { pointIndex: Int, point: String ->
                if (point == "#") {
                    val (start, end) = calculatePosition(positions, rowIndex, pointIndex)

                    positions[0] = start
                    positions[1] = end
                }
            }

            positions
        }

        val (lu, rd) = answer

        return intArrayOf(lu[0], lu[1], rd[0], rd[1])
    }

    private fun calculatePosition(positions: Array<IntArray>, rowIndex: Int, pointIndex: Int): Array<IntArray> {
        var (start, end) = positions

        val calculatedStart = calculateStart(start, rowIndex, pointIndex)
        val calculatedEnd = calculateEnd(end, rowIndex, pointIndex)

        return arrayOf(calculatedStart, calculatedEnd)
    }

    fun calculateEnd(end: IntArray, rowIndex: Int, pointIndex: Int): IntArray {
        val updatedEnd = end.copyOf()

        if (end[0] < rowIndex) {
            updatedEnd[1] = rowIndex + 1
        }

        if (end[1] < pointIndex) {
            updatedEnd[0] = pointIndex + 1
        }

        return updatedEnd
    }

    fun calculateStart(start: IntArray, rowIndex: Int, pointIndex: Int): IntArray {
        val updatedStart = start.copyOf()

        if (start[1] > rowIndex) {
            updatedStart[1] = rowIndex
        }

        if (start[0] > pointIndex) {
            updatedStart[0] = pointIndex
        }

        return updatedStart
    }
}