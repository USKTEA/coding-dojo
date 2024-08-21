import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun minReorder() {
        val result = solution.minReorder(
            6, arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 3),
                intArrayOf(2, 3),
                intArrayOf(4, 0),
                intArrayOf(4, 5),
            )
        )

        assertEquals(3, result)
    }

    @Test
    fun roads() {
        val roads = solution.visited(6)

        assertArrayEquals(
            BooleanArray(6) { false },
            roads
        )
    }
}
