import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve_1() {
        val result = solution.solve("abcde")

        assertEquals(0, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("abbaee")

        assertEquals(1, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("abcba")

        assertEquals(1, result)
    }
}
