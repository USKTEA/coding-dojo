class Solution {
    //[[1, 2, 3], [4, 5, 6], [7, 8, 9]] => [1, 2, 3, 6, 9, 8, 7, 4, 5]
    //[[1]] => [1]
    //[[1, 2]] => [1, 2]
    //[[1, 2], [3, 4]] => [1, 2, 4, 3]
    //val result = Array(matrix.length * martix[0].length) { 101 }
    //run(result, matrix)
    //result[current] = matrix[y][x]
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val initial = Array(matrix.size) {
            IntArray(matrix[0].size) { 101 }
        }

        return start(
            initial = initial,
            matrix = matrix,
            position = Position(0, 0),
            direction = Direction(1, 0),
            filled = 0,
        )
    }

    fun start(
        initial: Array<IntArray>,
        matrix: Array<IntArray>,
        position: Position,
        direction: Direction,
        filled: Int,
        result: MutableList<Int> = mutableListOf()
    ): MutableList<Int> {
        if (checkEnd(filled, matrix)) {
            return result
        }

        fill(initial, matrix, result, position)

        val blocked = checkBlocked(initial, matrix, position, direction)

        if (blocked) {
            val newDirection = direction.next()

            return start(
                initial = initial,
                matrix = matrix,
                position = position.move(newDirection),
                direction = newDirection,
                filled = filled + 1,
                result = result,
            )
        }

        return start(
            initial = initial,
            matrix = matrix,
            position = position.move(direction),
            direction = direction,
            filled = filled + 1,
            result = result,
        )
    }

    private fun fill(initial: Array<IntArray>, matrix: Array<IntArray>, result: MutableList<Int>, position: Position) {
        initial[position.y][position.x] = matrix[position.y][position.x]
        result.add(matrix[position.y][position.x])
    }

    private fun checkEnd(filled: Int, matrix: Array<IntArray>): Boolean {
        val size = matrix[0].size * matrix.size

        return filled >= size
    }

    fun checkBlocked(
        result: Array<IntArray>,
        matrix: Array<IntArray>,
        position: Position,
        direction: Direction
    ): Boolean {
        val (nextX, nextY) = position.move(direction)

        if (nextX > matrix[0].lastIndex || nextX < 0) {
            return true
        }

        if (nextY > matrix.lastIndex || nextY < 0) {
            return true
        }

        return result[nextY][nextX] != 101
    }
}

data class Direction(
    val x: Int,
    val y: Int,
) {
    fun next(): Direction {
        return Direction(
            x = y * -1,
            y = x * 1
        )
    }
}

data class Position(
    val x: Int,
    val y: Int,
) {
    fun move(direction: Direction): Position {
        return Position(
            x = x + direction.x,
            y = y + direction.y,
        )
    }
}
