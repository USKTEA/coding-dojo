import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DirectionTest {

    @Test
    fun whenIsNotBlocked() {
        val direction = Direction(x = 1, y = 0)
        val blocked = false
        assertEquals(Direction(x = 1, y = 0), direction.next(blocked))
    }

    @Test
    fun whenBlocked() {
        var direction = Direction(x = 1, y = 0)
        val blocked = true
        val directions = mutableListOf<Direction>()
        val correctDirections = listOf(
            Direction(0, 1),
            Direction(-1, 0),
            Direction(0, -1),
            Direction(1, 0)
        )

        for (i: Int in 0..3) {
            direction = direction.next(blocked)
            directions.add(direction)
        }

        assertEquals(correctDirections, directions)
    }
}
