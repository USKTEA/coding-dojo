import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("abcba")

        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("abecbea")

        assertEquals(0, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("baaaaa")

        assertEquals(1, result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve("aaaaab")

        assertEquals(1, result)
    }
}
