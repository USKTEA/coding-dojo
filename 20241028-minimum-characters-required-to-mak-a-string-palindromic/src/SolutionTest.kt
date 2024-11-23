import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("ABC")
        assertEquals(2, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("AACECAAAA")
        assertEquals(2, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("AAA")
        assertEquals(0, result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve("AAAB")
        assertEquals(1, result)
    }

    @Test
    fun solve_5() {
        val result = solution.solve("hqghumeaylnlfdxfi")
        assertEquals(16, result)
    }
}
