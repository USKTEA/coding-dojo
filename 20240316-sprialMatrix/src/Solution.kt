class Solution {
    //result size = m * n
    //1 <= a[m][n] <= 1000
    //[[1, 2]] => [1, 2]
    //[[1, 2], [3, 4]] => [1, 2, 4, 3]
    //[[1, 2], [3, 4], [5, 6] => [1, 2, 4, 6, 5, 3]
    //[[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [1, 2, 3, 6, 9, 8, 7, 4, 5]
    fun spiralOrder(matrix: List<ArrayList<Int>>): ArrayList<Int> {
        val result = arrayListOf<Int>()
        val passed = mutableListOf<Position>()
        val position = Position(x = 0, y = 0)
        val direction = Direction(x = 1, y = 0)

        return step(
            matrix = matrix,
            position = position,
            direction = direction,
            passed = passed,
            result = result,
            index = 0
        )
    }

    fun step(
        matrix: List<ArrayList<Int>>,
        position: Position,
        direction: Direction,
        passed: MutableList<Position>,
        result: ArrayList<Int>,
        index: Int
    ): ArrayList<Int> {
        if (index >= matrix.size * matrix[0].size) {
            return result
        }

        val (x, y) = position
        val (dx, dy) = direction

        passed.add(position)
        result.add(matrix[y][x])

        val isBlocked = isBlocked(matrix, passed, x + dx, y + dy)
        val newDirection = direction.next(isBlocked)
        val newPosition = Position(x = x + newDirection.x, y = y + newDirection.y)

        return step(
            matrix = matrix,
            position = newPosition,
            direction = newDirection,
            passed = passed,
            result = result,
            index = index + 1
        )
    }

    fun isBlocked(matrix: List<java.util.ArrayList<Int>>, passed: MutableList<Position>, x: Int, y: Int): Boolean {
        val xLimit = matrix[0].size
        val yLimit = matrix.size

        return x >= xLimit || x < 0 || y >= yLimit || y < 0 || passed.contains(Position(x, y))
    }
}

data class Position(
    val x: Int,
    val y: Int
)

data class Direction(
    val x: Int,
    val y: Int,
) {
    fun next(blocked: Boolean): Direction {
        if (!blocked) {
            return this
        }

        return Direction(-y, x)
    }
}
