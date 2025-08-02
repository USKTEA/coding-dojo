class Solution {
    fun solveNQueens(n: Int): ArrayList<ArrayList<String>> {
        val result = ArrayList<ArrayList<String>>()
        val queens = ArrayList<Point>()

        solve(
            boardSize = n,
            y = 0,
            queens = queens,
            result = result,
        )

        return result
    }

    private fun solve(
        boardSize: Int,
        y: Int,
        queens: ArrayList<Point>,
        result: ArrayList<ArrayList<String>>,
    ) {
        if (queens.size == boardSize) {
            result.add(makeBoard(queens))
            return
        }

        (0..<boardSize).forEach { x ->
            val point = Point(y = y, x = x)

            if (canPutQueen(queens, point)) {
                queens.add(point)
                solve(boardSize, y + 1, queens, result)
                queens.removeLast()
            }
        }
    }

    //(0, 0), (0, 1), (0, 2)
    //(1, 0), (1, 1), (1, 2)
    //(2, 0), (2, 1), (2, 2)
    private fun canPutQueen(queens: ArrayList<Point>, point: Point): Boolean {
        return queens.none { queen ->
            queen.x == point.x
                    || queen.y == point.y
                    || queen.y + queen.x == point.y + point.x
                    || queen.y - queen.x == point.y - point.x
        }
    }

    private fun makeBoard(queens: ArrayList<Point>): ArrayList<String> {
        val size = queens.size
        val result = ArrayList<String>(size)

        repeat(size) { y ->
            result.add(
                buildString {
                    repeat(size) { x ->
                        val point = Point(y = y, x = x)

                        if (point in queens) {
                            append("Q")
                            return@repeat
                        }

                        append(".")
                    }
                }
            )
        }

        return result
    }

    data class Point(
        val y: Int,
        val x: Int
    )
}
