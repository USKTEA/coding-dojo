import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve("()")

        assertEquals(1, result)

        val otherResult = solution.solve(")(")

        assertEquals(0, otherResult)

        val theOtherResult = solution.solve("(())")

        assertEquals(1, theOtherResult)
    }
}
