import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DirectionTest {
    //1, 0
    //0, 1 (y * -1) (x * 1)
    //-1, 0 (y * -1) (x * 1)
    //0, -1 (y * -1) (x * 1)
    @Test
    fun next() {
        var direction = Direction(x = 1, y = 0)

        direction = direction.next()

        assertEquals(Direction(x = 0, y = 1), direction)

        direction = direction.next()

        assertEquals(Direction(x = -1, y = 0), direction)

        direction = direction.next()

        assertEquals(Direction(x = 0, y = -1), direction)

        direction = direction.next()

        assertEquals(Direction(x = 1, y = 0), direction)
    }
}
