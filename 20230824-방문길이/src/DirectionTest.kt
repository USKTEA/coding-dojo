import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DirectionTest {
    @Test
    fun equality() {
        val direction1 = Direction(intArrayOf(0, 0), intArrayOf(1, 0))
        val direction2 = Direction(intArrayOf(0, 0), intArrayOf(1, 0))
        val direction3 = Direction(intArrayOf(1, 0), intArrayOf(0, 0))

        assertEquals(direction1, direction2)
        assertEquals(direction1, direction3)
    }
}
