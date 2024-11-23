import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("a")

        assertEquals("a1", result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve("abbhuabcfghh")

        assertEquals("a2b3h3u1c1f1g1", result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve("rtzb")

        assertEquals("r1t1z1b1", result)
    }
}
