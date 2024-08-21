class Solution {
    fun uniquePaths(x: Int, y: Int): Int {
        val matrix = toMatrix(x, y)
        val end = end(x, y)

        for (y: Int in end.second downTo 0) {
            for (x: Int in end.first downTo 0) {
                fillUniquePaths(matrix = matrix, x = x, y = y)
            }
        }

        return matrix[0][0]
    }

    private fun fillUniquePaths(matrix: Array<IntArray>, x: Int, y: Int) {
        if (y == matrix.lastIndex && x == matrix[0].lastIndex) {
            return
        }

        if (y == matrix.lastIndex || x == matrix[0].lastIndex) {
            matrix[y][x] = 1

            return
        }


        matrix[y][x] = matrix[y + 1][x] + matrix[y][x + 1]
    }

    fun toMatrix(x: Int, y: Int): Array<IntArray> {
        return Array(y) { IntArray(x) { 1 } }
    }

    fun end(x: Int, y: Int): Pair<Int, Int> {
        return Pair(x - 1, y - 1)
    }

    val factorial: Sequence<Long> = sequence {
        var current = 1L
        var next = 0L
        while (true) {
            yield(current)
            next += 1
            current *= next
        }
    }
}
