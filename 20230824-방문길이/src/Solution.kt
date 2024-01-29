import kotlin.math.absoluteValue

class Solution {
    fun solution(orders: String): Int {
        val coordinate = Coordinate(boundary = 5)
        val character = Character(coordinate)

        orders.forEach { order ->
            character.move(order)
        }

        return character.countUniquePath()
    }
}

class Character(
    private val coordinate: Coordinate,
    private var position: IntArray = intArrayOf(0, 0),
    private val directions: MutableList<Direction> = mutableListOf()
) {

    fun countUniquePath(): Int {
        return directions.toSet().size
    }

    fun move(direction: Char) {
        val next = when (direction) {
            'U' -> intArrayOf(this.position[0], this.position[1] + 1)
            'D' -> intArrayOf(this.position[0], this.position[1] - 1)
            'L' -> intArrayOf(this.position[0] - 1, this.position[1])
            else -> intArrayOf(this.position[0] + 1, this.position[1])
        }

        if (coordinate.checkIfOutOfBoundary(next)) {
            return
        }

        this.directions.add(Direction(position, next))
        this.position = next
    }

    fun current(): IntArray {
        return position
    }

    fun countDirections(): Int {
        return directions.size
    }
}

data class Direction(
    val previous: IntArray,
    val current: IntArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (javaClass != other?.javaClass) {
            return false
        }

        other as Direction

        if (previous.contentEquals(other.previous) && current.contentEquals(other.current)) {
            return true
        }

        if (previous.contentEquals(other.current) && current.contentEquals(other.previous)) {
            return true
        }

        return previous.contentEquals(other.current) && current.contentEquals(other.previous)
    }

    override fun hashCode(): Int {
        return 31 * (previous[0].hashCode() + previous[1].hashCode() + current[0].hashCode() + current[1].hashCode())
    }
}

class Coordinate(
    val boundary: Int
) {
    fun checkIfOutOfBoundary(position: IntArray): Boolean {
        return position[0].absoluteValue > boundary || position[1].absoluteValue > boundary
    }
}
