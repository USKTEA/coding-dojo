import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simpleTest() {
        val g = intArrayOf(1, 2, 3)
        val s = intArrayOf(1, 1)

        assertEquals(1, solution.findContentChildren(g, s))
    }

    @Test
    fun complexTest() {
        val g = intArrayOf(1, 2)
        val s = intArrayOf(1, 2, 3)

        assertEquals(2, solution.findContentChildren(g, s))
    }
}
