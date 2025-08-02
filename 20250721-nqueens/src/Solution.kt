class Solution {
    fun solveNQueens(n: Int): ArrayList<ArrayList<String>> {
        val result = arrayListOf<ArrayList<String>>()

        val visited = mutableSetOf<Position>()

        visit(
            y = 0,
            boardSize = n,
            visited = visited,
            result = result,
        )

        return result
    }

    private fun visit(
        y: Int,
        boardSize: Int,
        visited: MutableSet<Position>,
        result: ArrayList<ArrayList<String>>,
    ) {
        if (y == boardSize) {
            result.add(makeBoard(visited))

            return
        }

        (0..<boardSize).forEach { x ->
            val position = Position(y, x)

            if (canVisit(position, visited)) {
                visited.add(position)

                visit(
                    y = y + 1,
                    boardSize = boardSize,
                    visited = visited,
                    result = result
                )
                visited.remove(position)
            }
        }
    }

    private fun canVisit(
        position: Position,
        visited: MutableSet<Position>,
    ): Boolean {
        return visited.none { queen ->
            queen.x == position.x
                    || (queen.y + queen.x) == (position.y + position.x)
                    || (queen.y - queen.x) == (position.y - position.x)
        }
    }

    fun makeBoard(visited: MutableSet<Position>): ArrayList<String> {
        val size = visited.size
        val result = ArrayList<String>(size)

        repeat(size) { y ->
            result.add(
                CharArray(size) { x ->
                    if (Position(y, x) in visited) {
                        'Q'
                    } else {
                        '.'
                    }
                }.concatToString()
            )
        }

        return result
    }

    data class Position(val y: Int, val x: Int)
}
