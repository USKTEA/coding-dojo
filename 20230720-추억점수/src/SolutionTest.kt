import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val name = arrayOf("may", "kein", "kain", "radi")
    private val yearning = intArrayOf(5, 10, 1, 3)
    private val photo = arrayOf(
        arrayOf("may", "kein", "kain", "radi"),
        arrayOf("may", "kein", "brin", "deny"),
        arrayOf("kon", "kain", "may", "coni")
    )

    @Test
    fun solution() {
        val solution = Solution()
        val answer = solution.solution(name, yearning, photo)

        assertArrayEquals(intArrayOf(19, 15, 6), answer)
    }

    @Test
    fun toHashMap() {
        val solution = Solution()
        val pointsPerName = solution.toHashMap(name, yearning)

        assertEquals(
            mapOf("may" to 5, "kein" to 10, "kain" to 1, "radi" to 3),
            pointsPerName
        )
    }
}
