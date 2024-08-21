import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun canVisitAllRooms() {
        val result = solution.canVisitAllRooms(
            listOf(
                listOf(1),
                listOf(2),
                listOf(3),
                emptyList(),
            )
        )

        assertTrue(result)
    }


    @Test
    fun canVisitAllRooms_2() {
        val result = solution.canVisitAllRooms(
            listOf(
                listOf(1, 3),
                listOf(3, 0, 1),
                listOf(2),
                listOf(0),
            )
        )

        assertFalse(result)
    }

    @Test
    fun getVisitedRooms() {
        val visitedRooms = solution.getVisitedRooms(
            listOf(
                listOf(1),
                listOf(2),
                listOf(3),
                emptyList(),
            )
        )

        assertEquals(
            listOf(false, false, false, false),
            visitedRooms
        )
    }
}
