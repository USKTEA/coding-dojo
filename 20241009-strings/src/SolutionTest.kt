import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun vowelsAndConsonants() {
        val result = solution.vowelsAndConsonants("aba")

        assertEquals(2, result)
    }

    @Test
    fun solve() {
        val result = solution.solve("aabbccd", 2)

        assertEquals("d", result)
    }
}
