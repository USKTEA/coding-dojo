class Solution {
    //[[3, 2, 1], [1, 7, 6], [2, 7, 7]] => 1
    //[[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]] => 3
    fun equalPairs(grid: Array<IntArray>): Int {
        val columns = getColumns(grid)

        return columns.sumOf { column ->
            grid.count { row -> row.contentEquals(column) }
        }
    }

    fun getColumns(grid: Array<IntArray>): Array<IntArray> {
        val columns = grid.foldIndexed(Array(grid.size) { IntArray(grid.size) }) { index, acc, numbers ->
            numbers.forEachIndexed { i, number ->
                val column = acc[i]
                column[index] = number
            }

            acc
        }

        return columns
    }
}
