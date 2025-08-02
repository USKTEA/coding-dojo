class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val queensPositions = mutableListOf<Position>()

        placeQueensInRow(
            boardSize = n,
            currentRow = 0,
            queensPositions = queensPositions,
            result = result
        )

        return result
    }

    private fun placeQueensInRow(
        boardSize: Int,
        currentRow: Int,
        queensPositions: MutableList<Position>,
        result: MutableList<List<String>>
    ) {
        if (currentRow == boardSize) {
            val board = createBoardFromQueens(
                boardSize = boardSize,
                queensPositions = queensPositions
            )
            result.add(board)
            return
        }

        repeat(boardSize) { column ->
            if (canPlaceQueen(queensPositions = queensPositions, row = currentRow, col = column)) {
                queensPositions.add(Position(y = currentRow, x = column))

                placeQueensInRow(
                    boardSize = boardSize,
                    currentRow = currentRow + 1,
                    queensPositions = queensPositions,
                    result = result
                )

                queensPositions.removeLast()
            }
        }
    }

    private fun canPlaceQueen(
        queensPositions: List<Position>,
        row: Int,
        col: Int
    ): Boolean {
        val existingQueenColumns = queensPositions.map { it.x }.toSet()
        val existingMainDiagonals = queensPositions.map { it.y - it.x }.toSet()
        val existingAntiDiagonals = queensPositions.map { it.y + it.x }.toSet()

        return !existingQueenColumns.contains(col) &&
                !existingMainDiagonals.contains(row - col) &&
                !existingAntiDiagonals.contains(row + col)
    }

    private fun createBoardFromQueens(
        boardSize: Int,
        queensPositions: List<Position>
    ): List<String> {
        val queenColumnsByRow = queensPositions.associateBy { it.y }

        return (0 until boardSize).map { row ->
            buildString {
                repeat(boardSize) { column ->
                    if (queenColumnsByRow[row]?.x == column) {
                        append("Q")
                    } else {
                        append(".")
                    }
                }
            }
        }
    }

    data class Position(
        val y: Int,
        val x: Int
    )
}
